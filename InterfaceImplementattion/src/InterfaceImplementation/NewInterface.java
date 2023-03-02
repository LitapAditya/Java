package InterfaceImplementation;

import java.awt.*;
import java.sql.Array;
import java.util.List;

public interface NewInterface
{
    void display();

    default void testing()
    {
        System.out.println("TEST");
    }
}
