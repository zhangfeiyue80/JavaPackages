package com.syncsort.bex.ptrace;

public class StackInfo {
    public static StackTraceElement[] getStackTrace() {
        return new Throwable().getStackTrace();
    }
}

// usage example
/*
import com.syncsort.bex.ptrace.StackInfo;


    StackTraceElement[] stackElements=null;
    stackElements = StackInfo.getStackTrace();

    if(stackElements != null)
    {
        for(int i = 0; i < stackElements.length; i++)
        {
            System.out.println(""+ stackElements[i]); 
        }
    }
*/
