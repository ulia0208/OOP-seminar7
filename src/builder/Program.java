package builder;

public class Program {
    public static void main(String[] args) {

        StringBuilder stringBuilder=new StringBuilder("aaa");
        String s=stringBuilder
                .append("nn")
                .append("jj")
                .insert(2,"rrrrr")
                .append("fgyuyg")
                .toString();

        System.out.println(s);


        new OrderBuilder()
                .setProductID(1)
                .setProductName("coco")
                .setQnt(2)
                .setPrice(100.5)
                .setClientName("Ulia")
                .setCompanyName("ju-ju")
                .build();



    }
}
