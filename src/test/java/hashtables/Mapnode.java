package hashtables;

public class Mapnode {

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
            Mapnode mapNode = this.myLinkedList.search(key);
            if (mapNode == null) {
                mapNode = new Mapnode(key, value);
                this.myLinkedList.append(mapNode);
            } else {
                mapNode.setValue(value);
            }
        }
}
