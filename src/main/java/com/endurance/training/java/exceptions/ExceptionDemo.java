package com.endurance.training.java.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.rmi.AccessException;

/**
 * Created by rahul.go on 25/07/16.
 */
public class ExceptionDemo
{
    public static void main(String[] args)
    {
        try (FileInputStream input = new FileInputStream("file.txt"))
        {

            int data = input.read();
            while (data != -1)
            {
                System.out.print((char) data);
                data = input.read();
            }
            ExceptionDemo demoObj = new ExceptionDemo();
            demoObj.throwException1();
            demoObj.throwException2();
            demoObj.throwException3();
            demoObj.throwException4();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Missing File");
        }
        catch (ReflectiveOperationException e)
        {
            System.out.println("UnKnown Error");
        }
        catch (AccessDeniedException | AccessException e)
        {
            System.out.println("Access Error");
        }

        catch (IOException e)
        {
            System.out.println("I/O error");
        }
        finally
        {
            System.out.println("I'm always executed");
        }


    }

    private void throwException4() throws AccessDeniedException
    {
        throw new AccessDeniedException("demo");
    }

    private void throwException2() throws AccessException
    {
        throw new AccessException("demo");
    }

    private void throwException3() throws ReflectiveOperationException
    {
        throw new ReflectiveOperationException();
    }


    private void throwException1() throws NumberFormatException
    {
        throw new NumberFormatException();
    }

}
