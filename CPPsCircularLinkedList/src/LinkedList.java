public class LinkedList
{
    Node tail;
    int count;

    public int getCount()
    {
        return count;
    }

    public void insertAtBeginning(int data)
    {
        Node node = new Node();
        if (tail == null)
        {
            node.setData(data);
            node.setNext(node);
            tail = node;
        }

        else
        {
            node.setData(data);
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        count++;
    }

    public void insertAtEnd(int data)
    {
        Node node = new Node();
        if (tail == null)
        {
            insertAtBeginning(data);
        }

        else
        {
            node.setData(data);
            node.setNext(tail.getNext());
            tail.setNext(node);
            tail = node;

            count++;
        }
    }

    public void deleteAtBeginning()
    {
        if (tail == null)
            System.out.println("NO LIST PRESENT");

        else if (tail.getNext() == tail)
        {
            tail = null;
            count--;
        }

        else
        {
            tail.setNext((tail.getNext()).getNext());
            count--;
        }
    }

    public void deleteAtEnd()
    {
        if (tail == null || tail.getNext() == tail)
            deleteAtBeginning();

        else
        {
            Node nodeReference = tail;
            while ((nodeReference.getNext()) != tail)
                nodeReference = nodeReference.getNext();

            nodeReference.setNext(tail.getNext());
            tail.setNext(null);
            tail = nodeReference;

            count--;
        }
    }

    public void insertInBetween(int data, int position)
    {
        if (position > count + 1)
        {
            System.out.println("INVALID POSITION");
        }

        else
        {
            if (position == 1)
                insertAtBeginning(data);

            else
            {
                Node newNode = new Node();
                newNode.setData(data);
                Node nodeReference = tail;
                int i = position - 1;

                while (i != 0)
                {
                    nodeReference = nodeReference.getNext();
                    if (nodeReference == tail)
                    {
                        break;
                    }
                    i--;
                }

                newNode.setNext(nodeReference.getNext());
                nodeReference.setNext(newNode);

                if (nodeReference == tail)
                {
                    tail = newNode;
                }

                count++;
            }
        }
    }

    public void deleteFromBetween(int position)
    {
        if (position > count)
            System.out.println("INVALID POSITION");

        else
        {
            if (tail == null || position == 1)
                deleteAtBeginning();

            else
            {
                Node nodeReference = tail;
                Node toBeDeleted = null;
                int i = position - 1;

                while (i != 0)
                {
                    nodeReference = nodeReference.getNext();
                    if (nodeReference == tail)
                    {
                        break;
                    }
                    i--;
                }

                toBeDeleted = nodeReference.getNext();

                if (toBeDeleted == tail)
                {
                    tail = nodeReference;
                }

                nodeReference.setNext(toBeDeleted.getNext());
                toBeDeleted.setNext(null);

                count--;
            }
        }
    }

    public void traverseList()
    {
        Node displayNode = tail;

        if (tail == null)
        {
            System.out.println("NO LIST PRESENT");
        }

        else
            do
            {
                displayNode = displayNode.getNext();
                System.out.println(displayNode.getData());
            } while (displayNode != tail);
    }
}