package ArrayListBased;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListOperations
{
    public List<Object> removeDuplicates(List<Object> list)
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

    public List<Object> reverseArrayList(List<Object> list)
    {
        for (int i = 0; i < list.size() / 2; i++)
        {
            List<Object> objectList = new LinkedList<>();
            objectList.add(list.get(i));
            list.set(i, list.get(list.size() - 1));
            list.set(list.size() - 1, objectList.get(0));
            objectList.remove(0);
        }
        return list;
    }
}