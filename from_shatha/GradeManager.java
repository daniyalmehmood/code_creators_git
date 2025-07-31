
public class GradeManager{
    public static String[] reverseStudentNames(String[] var0) {
        String[] var1 = new String[var0.length];

        for(int var2 = 0; var2 < var0.length; ++var2) {
            var1[var2] = (new StringBuilder(var0[var2])).reverse().toString();
        }

        return var1;
    }

    public static char getLetterGrade(int var0) {
        if (var0 >= 90 && var0 <= 100) {
            return 'A';
        } else if (var0 >= 80 && var0 <= 89) {
            return 'B';
        } else if (var0 >= 70 && var0 <= 79) {
            return 'C';
        } else {
            return (char)(var0 >= 60 && var0 <= 69 ? 'D' : 'F');
        }
    }

    public static String[] findFailingStudents(String[] var0, int[] var1) {
        int var2 = 0;

        for(int var6 : var1) {
            if (var6 < 60) {
                ++var2;
            }
        }

        String[] var7 = new String[var2];
        int var8 = 0;

        for(int var9 = 0; var9 < var1.length; ++var9) {
            if (var1[var9] < 60) {
                var7[var8] = var0[var9];
                ++var8;
            }
        }

        return var7;
    }

    public static void main(String[] var0) {
        String[] var1 = new String[]{"Sam", "Lara", "Tom", "Diana"};
        int[] var2 = new int[]{88, 70, 59, 100};
        String[] var3 = reverseStudentNames(var1);
        System.out.print("reversed names: {");

        for(int var4 = 0; var4 < var3.length; ++var4) {
            System.out.print(var3[var4]);
            if (var4 < var3.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
        char[] var7 = new char[var2.length];

        for(int var5 = 0; var5 < var2.length; ++var5) {
            var7[var5] = getLetterGrade(var2[var5]);
        }

        System.out.print("Letter Grades: {");

        for(int var8 = 0; var8 < var7.length; ++var8) {
            System.out.print(var7[var8]);
            if (var8 < var7.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
        String[] var9 = findFailingStudents(var1, var2);
        System.out.print("Failing Students: {");

        for(int var6 = 0; var6 < var9.length; ++var6) {
            System.out.print(var9[var6]);
            if (var6 < var9.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("}");
    }
}
