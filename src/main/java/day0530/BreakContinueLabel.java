package day0530;

/**
 * 循环中的例外
 *   - break
 *   - continue
 *   - label
 */
public class BreakContinueLabel {
    public static void main(String[] args) {
        /*
        123
         */
        breakInLoop();
        /*
        12356789
         */
        continueInLoop();

        /*
        123,123,123,
         */
        breakInDoubleLoop();
        /*
        12356789,12356789,12356789,
         */
        continueInDoubleLoop();

        /*
        123
         */
        breakWithSpecialLabel();
        /*
        123123123
         */
        continueWithSpecialLabel();
    }

    private static void continueWithSpecialLabel() {
        specialLabel:for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    // continue to special label
                    continue specialLabel;
                }

                System.out.print(j);
            }

            System.out.print(",");
        }

        System.out.println();
    }

    private static void breakWithSpecialLabel() {
        specialLabel:for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    // break to special label
                    break specialLabel;
                }

                System.out.print(j);
            }

            System.out.print(",");
        }

        System.out.println();
    }

    private static void continueInDoubleLoop() {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    continue;
                }

                System.out.print(j);
            }

            System.out.print(",");
        }

        System.out.println();
    }

    private static void breakInDoubleLoop() {
        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < 10; j++) {
                if (j == 4) {
                    break;
                }

                System.out.print(j);
            }

            System.out.print(",");
        }

        System.out.println();
    }

    private static void continueInLoop() {
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                /*
                command + click
                 */
                continue;
            }

            System.out.print(i);
        }

        System.out.println();
    }

    private static void breakInLoop() {
        for (int i = 1; i < 10; i++) {
            if (i == 4) {
                break;
            }

            System.out.print(i);
        }

        System.out.println();
    }
}
