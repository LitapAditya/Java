package ListBasedPrograms;

import java.util.List;
import java.util.ListIterator;

public class ListOperations
{
    public int countDuplicates(List<Object> list)
    {
        List<Object> listWithoutDuplicates = removeDuplicates(list);
        return list.size() - listWithoutDuplicates.size();
    }

    private List<Object> removeDuplicates(List<Object> list)
    {
        int sizeValue = list.size();
        System.out.println(list);
        for (int i = 0; i < sizeValue; i++)
        {
            for (int j = i + 1; j < sizeValue; j++)
            {
                if (list.get(i).equals(list.get(j)))
                {
                    list.remove(j);
                    sizeValue--;
                    System.out.println(list);
                }
            }
        }
        return list;
    }

    public void reverseTraverse(List<Object> list)
    {
        ListIterator<Object> listIterator = list.listIterator();

        while (listIterator.hasNext())
        {
            listIterator.next();
        }

        while (listIterator.hasPrevious())
        {
            System.out.println(listIterator.previous());
        }
    }

    public
}
