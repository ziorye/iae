package day0530;

/**
 * 分支结构2：switch-case
 *
 * switch ...
 * (byte/short/char/int/String[7]/enum[5])
 * case 常量非范围、why(int boolean)
 * break 必须vs可选
 * default 可选&位置
 */
public class Switch {
    public static void main(String[] args) {
        switch1(3);
        switch2("星期二");
        switch3(2023, 5);
    }

    private static void switch1(int i) {
        /*
        Open Module Settings
        17 - ...
        8 - ...
        14 - Switch expressions
         */
        switch (i) {
            case 1:
                System.out.println("i的值为1");
                break;
            // without break
            case 2:
                System.out.println("i的值为2");
                break;
            default:
                System.out.println("default case");
        }
    }

    private static void switch2(String week) {
        switch (week) {
            case "星期一":
                System.out.println("MONDAY");
                break;
            case "星期二":
                System.out.println("TUESDAY");
                break;
            case "星期三":
                System.out.println("WEDNESDAY");
                break;
            case "星期四":
                System.out.println("THURSDAY");
                break;
            case "星期五":
                System.out.println("FRIDAY");
                break;
            case "星期六":
                System.out.println("SATURDAY");
                break;
            case "星期天":
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("unknown");
        }
    }

    private static void switch3(int year, int month) {
        /*
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDays = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDays = 30;
                break;
            case 2:
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0))
                    numDays = 29;
                else
                    numDays = 28;
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
         */
        int numDays = 0;

        switch (month) {
            case 1:
                numDays = 31;
                break;
            case 4:
                numDays = 30;
                break;
            case 2:
                // 28 or 29
                break;
            default:
                System.out.println("Invalid month.");
                break;
        }
        System.out.println("Number of Days = " + numDays);
    }
}
