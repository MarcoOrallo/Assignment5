import java.util.Scanner;
import java.util.Random;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.lang.String;

public class MatMultiply {
    public static void main(String[] args) throws Exception {
        int[][] mat1 = new int[3][3];
        int[][] mat2 = new int[3][3];
        int[][] mat3 = new int[3][3];
        int rowOne, columnOne, rowTwo, columnTwo;
        int[][] mat4;
        int[][] mat5;
        String caseUserInput = "", fileNameOne = "", fileNameTwo = "";
        int i, j, k;
        
        Scanner scnr = new Scanner(System.in);
        System.out.println("Case 2 or 3? (Type 'case2' or 'case3'): ");
        caseUserInput = scnr.nextLine();
        switch (caseUserInput) {
            case "case2" -> {
                Random rand = new Random();
                System.out.println("Print file name for matrix 1: ");
                fileNameOne = scnr.nextLine();
                System.out.println("Print file name for matrix 2: ");
                fileNameTwo = scnr.nextLine();

                for(i=0; i<mat1.length; i++) {
                    for(j=0; j<mat1[i].length; j++) {
                        mat1[i][j] = rand.nextInt(10);
                    }
                }
                for(i=0; i<mat2.length; i++){
                    for(j=0; j<mat2[i].length; j++) {
                        mat2[i][j] = rand.nextInt(10);
                    }
                }
                for(i=0; i<mat3.length; i++){
                    for(j=0; j<mat3[i].length; j++) {
                        mat3[i][j] = 0;
                        for(k=0; k<mat1[i].length; k++){
                            mat3[i][j] += mat1[i][j] * mat2[i][j];
                        }
                    }
                }

                FileWriter writer = new FileWriter(fileNameOne + ".txt");
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("%d %d\n".formatted(mat1.length, mat1[0].length));
                for(i=0; i<mat1.length; i++) {
                    for(j=0; j<mat1[i].length; j++) {
                        bw.write("%d ".formatted(mat1[i][j]));
                    }
                    if (i != mat1.length-1)
                    bw.write("\n");
                }
                bw.close();

                FileWriter wrt = new FileWriter(fileNameTwo + ".txt");
                BufferedWriter buf = new BufferedWriter(wrt);
                buf.write("%d %d\n".formatted(mat1.length, mat1[0].length));
                for(i=0; i<mat1.length; i++) {
                    for(j=0; j<mat1[i].length; j++) {
                        buf.write("%d ".formatted(mat1[i][j]));
                    }
                    if (i != mat1.length-1)
                    buf.write("\n");
                }
                buf.close();
            }

            case "case3" -> {
                Random random = new Random();
                System.out.println("Input rows of first matrix: ");
                rowOne = scnr.nextInt();
                System.out.println("Input columns of first matrix");
                columnOne = scnr.nextInt();
                System.out.println("Please keep in mind that the rows of the first matrix and the columns of the second matrix must be the same size.");
                System.out.println("Input rows of second matrix: ");
                rowTwo = scnr.nextInt();
                System.out.println("Input columns of second matrix: ");
                columnTwo = scnr.nextInt();
                mat4 = new int[rowOne][columnOne];
                mat5 = new int[rowTwo][columnTwo];

                for(i=0; i<mat4.length; i++) {
                    for(j=0; j<mat4[i].length; j++) {
                        mat4[i][j] = random.nextInt(10);
                    }
                }
                for(i=0; i<mat5.length; i++){
                    for(j=0; j<mat5[i].length; j++) {
                        mat5[i][j] = random.nextInt(10);
                    }
                }
                for(i=0; i<mat3.length; i++){
                    for(j=0; j<mat3[i].length; j++) {
                        mat3[i][j] = 0;
                        for(k=0; k<mat1[i].length; k++){
                            mat3[i][j] += mat4[i][j] * mat5[i][j];
                        }
                    }
                }

                FileWriter writer = new FileWriter("matrix1.txt");
                BufferedWriter bw = new BufferedWriter(writer);
                bw.write("%d %d\n".formatted(mat4.length, mat4[0].length));
                for(i=0; i<mat4.length; i++) {
                    for(j=0; j<mat4[i].length; j++) {
                        bw.write("%d ".formatted(mat4[i][j]));
                    }
                    if (i != mat4.length-1)
                    bw.write("\n");
                }
                bw.close();

                FileWriter wrt = new FileWriter("matrix2.txt");
                BufferedWriter buf = new BufferedWriter(wrt);
                buf.write("%d %d\n".formatted(mat5.length, mat5[0].length));
                for(i=0; i<mat5.length; i++) {
                    for(j=0; j<mat5[i].length; j++) {
                        buf.write("%d ".formatted(mat5[i][j]));
                    }
                    if (i != mat5.length-1)
                    buf.write("\n");
                }
                buf.close();
            }
            default -> {
                System.out.println("Please use 'case2' or 'case3'");
                System.exit(1);
            }
        }


        /* FOR DEBUG USE
        System.out.println("Matrix 1: ");
        for(i=0; i<mat1.length; i++) {
            System.out.println(Arrays.toString(mat1[i]));
        }
        System.out.println("Matrix 2: ");
        for(i=0; i<mat2.length; i++) {
            System.out.println(Arrays.toString(mat2[i]));
        }
        System.out.println("Matrix 3: ");
        for(i=0; i<mat3.length; i++) {
            System.out.println(Arrays.toString(mat3[i]));
        }
        */

        FileWriter writer = new FileWriter("Matrix3.txt");
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write("%d %d\n".formatted(mat3.length, mat3[0].length));
        for(i=0; i<mat3.length; i++) {
            for(j=0; j<mat3[i].length; j++) {
                bw.write("%d ".formatted(mat3[i][j]));
            }
            if (i != mat3.length-1)
            bw.write("\n");
        }
        bw.close();


    }
}

