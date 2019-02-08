public class java {
    public static void main(String[] args) {

        System.out.println(icyHot(20, 30));
        System.out.println(doubleX("abcxx"));
        System.out.println(helloName("Talia"));
        System.out.println(bobThere("blbmsdfhs"));
        System.out.println(countTriple("dkfjjjjsdlkjeee"));
        int[] array={1,2,3};
        System.out.println(sum3(array));
        System.out.println(lucky13(array));
        System.out.println(canBalance(array));
        System.out.println(love6(2, 4));
        System.out.print(loneSum(6, 6, 14));

    }
    //WU1: icyHot
    public static boolean icyHot(int temp1, int temp2) {
        if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
            return true;
        } else {
            return false;
        }
    }





    //WU2: doubleX
    public static boolean doubleX(String str) {
        int a = str.indexOf("x");
        if (a == -1) {
            return false;
        } else {
            if ((a + 1) >= str.length()) {
                return false;
            } else {
                if (str.substring(a + 1, a + 2).equals("x")) {
                    return true;
                } else {
                    return false;
                }

            }
        }
    }


    //String1: helloName
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }

    //String2: bobThere
    public static boolean bobThere(String str) {
        String one = "b";
        for (int i = 0; i < str.length() - 2; i++) {
            String first = str.substring(i, i + 1);
            String second = str.substring(i + 2, i + 3);
            if (first.equals(one) && second.equals(one)) {
                return true;
            }
        }
        return false;
    }


//String3:countTriple

    public static int countTriple(String str) {
        int count = 0;
        for (int i = 0; i < (str.length() - 2); i++) {
            if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2))
                count += 1;
        }
        return count;
    }

    //Array1: sum 3:
    public static int sum3(int[] nums) {
        return (nums[0] + nums[1] + nums[2]);
    }

    //Array2:lucky13:
    public static boolean lucky13(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1 || nums[i] == 3) {
                return false;
            }
        }
        return true;
    }

    //Array3: canBalance:
    public static boolean canBalance(int[] nums) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < nums.length; i++) {
            sum1 += nums[i];
            sum2 = 0;
            for (int a = i + 1; a < nums.length; a++) {
                sum2 += nums[a];
            }
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;
    }

    //Logic1:love6:
    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6) {
            return true;
        }
        if (a - b == 6 || b - a == 6 || a + b == 6) {
            return true;
        }
        return false;
    }

    //Logic2: loneSum:
    public static int loneSum(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return a + b + c;
        }
        if (a == b && a != c) {
            return c;
        }
        if (a == c && a != b) {
            return b;
        }
        if (b == c && a != c) {
            return a;
        }
        if (a == b && a == c) {
            return 0;
        }
        return 12;
    }

}