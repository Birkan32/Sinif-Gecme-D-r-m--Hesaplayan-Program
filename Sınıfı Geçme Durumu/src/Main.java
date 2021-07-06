import java.util.Scanner ;
public class Main {
    public static void main(String[] args) {
        int Matematik, Fizik, Türkce, Kimya, Müzik ;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz :");
        Matematik =input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz :");
        Fizik =input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz :");
        Türkce =input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        Kimya =input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz :");
        Müzik =input.nextInt();

        if (Matematik<0 || Matematik>100) {
            System.out.print(Matematik=0);
        }else
            System.out.print(Matematik);

        if (Fizik<0 || Fizik>100) {
            System.out.print(Fizik=0);
        }else
            System.out.print(Fizik);

        if (Türkce<0 || Türkce>100) {
            System.out.print(Türkce=0);
        }else
            System.out.print(Türkce);

        if (Kimya<0 || Kimya>100) {
            System.out.print(Kimya=0);
        }else
            System.out.print(Kimya);

        if (Müzik<0 || Müzik>100) {
            System.out.print(Müzik=0);
        }else
            System.out.print(Müzik);




        double avarage = (Matematik+Fizik+Türkce+Kimya+Müzik)/5.0;
        System.out.println(avarage);

    }
}
