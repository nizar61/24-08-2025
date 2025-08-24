
public class SavingsAccount {

    public static void main(String[] args) {
        // Membuat objek CheckingAccount
        CheckingAccount ca001 = new CheckingAccount();

        // Mengatur nilai balance dan name
        ca001.balance = 5000.0;
        ca001.name = "Budi";

        // Menampilkan informasi rekening
        System.out.println("Nama Pemilik Rekening: " + ca001.name);
        System.out.println("Saldo Rekening: Rp" + ca001.balance);
    }

    public int balance;
    public double interestRate;
    public String name;
}
