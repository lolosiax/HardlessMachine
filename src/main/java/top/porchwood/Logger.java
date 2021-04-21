package top.porchwood;

import org.jetbrains.annotations.NotNull;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Logger {
    private static Logger logger;
    public static boolean IsInDebugMod = false;
    private static SimpleDateFormat sdf = new SimpleDateFormat("[HH:mm:ss]");

    private Logger() { }

    public static Logger getLogger() {
        if(logger != null)return logger;
        else return logger = new Logger();
    }

    public void error(String s) {
        print(s, "&c[ERROR]");
    }

    public void error(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        error(sw.toString());
        pw.close();
    }

    public void info(String s) {
        print(s, "&r[INFO] ");
    }

    public void info(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        info(sw.toString());
        pw.close();
    }

    public void debug(String s) {
        print(s, "&1[DEBUG]");
    }

    public void debug(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        debug(sw.toString());
        pw.close();
    }

    public void warn(String s) {
        print(s, "&6[WARN] ");
    }

    public void warn(Exception e) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        e.printStackTrace(pw);
        warn(sw.toString());
        pw.close();
    }

    private void print(String s, String mode) {
        if (s == null) {
            logger.warn("" +
                    "&b&l&n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n" +
                    "&b&l||  Logger System found a null information. ||\n" +
                    "&b&l||  Please check the server language file.  ||\n" +
                    "&b&l||  Is is out the version?                  ||\n" +
                    "&b&l&n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
            return;
        }
        String[] ss = s.split("\n");
        String time = getTime();
        for (String value : ss) {
            System.out.println(toColorFont("&r[HardlessMachine] "+ value + "&r"));
        }
    }

    public String getTime() {
        return sdf.format(new Date());
    }



    private static String toColorFont(@NotNull String origin) {
        StringBuilder out = new StringBuilder();
        String[] s = origin.replace("&", "&\u007f").split("&");//
        for (String str : s) {
            if (str.length() != 0 && str.length() >= 2 && str.substring(0, 2).matches("^\u007f[0-9A-Fa-fK-Ok-oRr]")) {
                String color = str.substring(0, 2).replace("\u007f", "").toLowerCase(Locale.ENGLISH);
                str = str.substring(2);
                switch (color) {
                    case "0":
                        out.append("\033[30m");
                        break;
                    case "1":
                        out.append("\033[34m");
                        break;
                    case "2":
                        out.append("\033[32m");
                        break;
                    case "3":
                        out.append("\033[36m");
                        break;
                    case "4":
                        out.append("\033[31m");
                        break;
                    case "5":
                        out.append("\033[35m");
                        break;
                    case "6":
                        out.append("\033[33m");
                        break;
                    case "7":
                        out.append("\033[37m");
                        break;
                    case "8":
                        out.append("\033[90m");
                        break;
                    case "9":
                        out.append("\033[94m");
                        break;
                    case "a":
                        out.append("\033[92m");
                        break;
                    case "b":
                        out.append("\033[96m");
                        break;
                    case "c":
                        out.append("\033[91m");
                        break;
                    case "d":
                        out.append("\033[95m");
                        break;
                    case "e":
                        out.append("\033[93m");
                        break;
                    case "f":
                        out.append("\033[97m");
                        break;
                    case "k":
                        out.append("\033[5m");
                        break;
                    case "l":
                        out.append("\033[1m");
                        break;
                    case "m":
                        out.append("\033[9m");
                        break;
                    case "n":
                        out.append("\033[4m");
                        break;
                    case "o":
                        out.append("\033[3m");
                        break;
                    case "r":
                        out.append("\033[0m");
                        break;
                }
                out.append(str);
            } else out.append(str.replace("\u007f", "&"));
        }
        return out.toString();
    }
}
