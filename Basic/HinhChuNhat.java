public class HinhChuNhat {
    public static class Rectangle{
        private int height;
        private int width;
        Rectangle(){

        }
        Rectangle(int h, int w){
            this.height = h;
            this.width = w;
        }
        void setHeight(int h){
            this.height = h;
        }
        int getHeight(){
            return this.height;
        }

        void setWidth(int w){
            this.width= w;
        }
        int getWidth(){
            return this.width;
        }

        int getDienTich(){
            return this.height * this.width;
        }
        int getChuVi(){
            return (this.height + this.width) * 2;
        }
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5,6);
        System.out.println(r1.getChuVi());
        System.out.println(r1.getDienTich());
    }
}
