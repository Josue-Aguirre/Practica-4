package curp_rfc;

//import java.util.Random;
import java.util.Scanner;

public class Mexicano{
	String nom, ape, curp, rfc;
	int s,d, m, a;
	public Mexicano(String nom, String ape, String curp, String rfc, int s, int d, int m, int a)
    {
    	this.nom=nom;
    	this.ape=ape;
    	this.s=s;
    	this.d=d;
    	this.m=m;
    	this.a=a;
    	this.curp=curp;
    	this.rfc=rfc;
    }
	public Mexicano()
    {
    	this.nom=null;
    	this.ape=null;
    	this.s=0;
    	this.d=0;
    	this.m=0;
    	this.a=0;
    	this.curp=null;
    	this.rfc=null;
    }
	public void asignardatos(Scanner sc)
	{
		System.out.println("Usuario {");
		System.out.print("Nombre=");
		this.nom = sc.next();
		System.out.print("Apellidos=");
		this.ape = sc.next();
		System.out.print("Sexo(H=0||M=1)=");
		this.s = sc.nextInt();
		System.out.print("Dia=");
		this.d = sc.nextInt();
		System.out.print("Mes=");
		this.m = sc.nextInt();
		System.out.print("Año=");
		this.a = sc.nextInt();
	}
	public String toString() {
        return "Usuario="+"\n Nombre=" + nom + "\n Apellidos=" + ape + "\n Sexo=" + s + "\n Dia=" + d + "\n mes=" + m + "\n año=" + a + "\n Curp=" + curp + "\n RFC=" + rfc;
    }
	public String getnom() {
        return nom;
    }
	public void setnom(String nom) {
        this.nom = nom;
    }
    public String getape() {
        return ape;
    }
    public void setape(String ape) {
        this.ape = ape;
    }
    public int gets() {
        return s;
    }
    public void sets(int s) {
        this.s = s;
    }
    public int getd() {
        return d;
    }
    public void setd(int d) {
        this.d = d;
    }
    public int getm() {
        return m;
    }
    public void setm(int m) {
        this.m = m;
    }
    public int geta() {
        return a;
    }
    public void seta(int a) {
        this.a = a;
    }
    public String getcurp() {
        return curp;
    }
	public void setcurp(String curp) {
        this.curp = curp;
    }
    public String getrfc() {
        return rfc;
    }
    public void setrfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void CreaCurp(String nom, String ape)
    {
    	System.out.printf("\nCURP: " + this.ape + this.nom + this.a + this.m + this.d);
    }
    
}
