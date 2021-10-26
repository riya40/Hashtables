package hashtables;

public class MyLinkedList {
    Mapnode head;
    Mapnode tail;

    public void append(Mapnode mapNode) {
        if (head == null) {
            head = mapNode;
            tail = mapNode;
        } else {
            this.tail.setNext(mapNode);
            this.tail = mapNode;
        }

    }

    public Mapnode search(K key) {
        Mapnode tempNode = head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                return tempNode;
            } else {
                tempNode = tempNode.getNext();
            }
        }
        return null;
    }
}
