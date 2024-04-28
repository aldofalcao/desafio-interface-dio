import internet.ImpInternet;
import ipod.ImpIpod;
import phone.ImpPhone;

public class Iphone {
    public static void main(String[] args) throws Exception {

        ImpIpod ipod = new ImpIpod();
        ipod.tocar();

        ImpPhone phone = new ImpPhone();
        phone.ligar();

        ImpInternet internet = new ImpInternet();
        internet.navegar();

    }
}
