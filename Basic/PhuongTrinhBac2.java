import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static class PTBac2 {
        private double a;
        private double b;
        private double c;

        PTBac2() {

        }

        PTBac2(double a, double b, double c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public void setA(double a) {
            this.a = a;
        }

        public double getA(double a) {
            return this.a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getB(double b) {
            return this.b;

        }

        public void setC(double c) {
            this.c = c;
        }

        public double getC(double c) {
            return this.c;

        }

        public double delta() {
            return b * b - 4 * a * c;
        }

        public void TimNghiem() {
            if (this.a == 0) {
                if (this.b == 0) {
                    if (this.c == 0) {
                        System.out.println("Phương trình vô số nghiệm");
                    } else {
                        System.out.println("Phương trình vô nghiệm");
                    }
                } else {
                    System.out.println("Phương trình có nghiệm: " + (-c / b));
                }
            } else {
                if (delta() < 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else if (delta() == 0) {
                    System.out.println("Phương trình có nghiệm kép" + (-b / (2 * a)));
                } else {
                    System.out.println("Phương trình có nghiệm phân biệt: x1 = " + (-b - Math.sqrt(delta())) / (2 * a) + ", x2 = " + (-b + Math.sqrt(delta())) / (2 * a));
                }
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        PTBac2 p1 = new PTBac2(a, b, c);
        p1.TimNghiem();

    }


}

