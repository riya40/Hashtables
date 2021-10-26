package hashtables;

/**
 * Hello world!
 *
 */
public class HashTables
{
    public class HashTable<K,V> {
        MyLinkedList<K> myLinkedList;

        public HashTable() {
            myLinkedList = new MyLinkedList<>();
        }

        public V get(K key) {
            MapNode<K, V> mapNode = this.myLinkedList.search(key);
            if (mapNode == null) {
                return null;
            } else {
                return mapNode.getValue();
            }
        }

        public void add(K key, V value) {
            MapNode mapNode = this.myLinkedList.search(key);
            if (mapNode == null) {
                mapNode = new MapNode(key, value);
                this.myLinkedList.append(mapNode);
            } else {
                mapNode.setValue(value);
            }
        }
    }
}