package com.syncsort.bex.ptrace;

import java.io.StringWriter;
import java.io.PrintWriter;

public class ExceptionUtil {
    public static String getStackTrace(Throwable throwable) {
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    try {
        throwable.printStackTrace(pw);
        return sw.toString();
    } finally {
        pw.close();
    }
    }
}


// Usage Examples:
/*
import com.syncsort.bex.ptrace.ExceptionUtil;

logger.msgLog(SVHMsg.SVH_099, msgCat, ExceptionUtil.getStackTrace(e));
*/
