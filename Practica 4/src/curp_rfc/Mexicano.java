package curp_rfc;

import java.util.Random; 
import java.util.Scanner;

public class Mexicano{
	String nom, nom2, ape, ape2, s, a, m, d, curp, rfc;
	public Mexicano()
    {
    	this.nom=null;
    	this.nom2=null;
    	this.ape=null;
    	this.ape2=null;
    	this.s=null;
    	this.d=null;
    	this.m=null;
    	this.a=null;
    	this.curp=null;
    	this.rfc=null;
    }
	
	public void asignardatos(Scanner sc)
	{
		System.out.println("Usuario {");
		System.out.print("Nombre1=");
		this.nom = sc.next();
		System.out.print("Nombre2=");
		this.nom2 = sc.next();
		System.out.print("Apellido1=");
		this.ape = sc.next();
		System.out.print("Apellido2=");
		this.ape2 = sc.next();
		System.out.print("Sexo(H/M)=");
		this.s = sc.next();
		System.out.print("Año=");
		this.a = sc.next();
		System.out.print("Mes=");
		this.m = sc.next();
		System.out.print("Dia=");
		this.d = sc.next();
	}
	
	public String toString() {
        return "Usuario="+"\n Nombre=" + nom + "\n Nombre2=" + nom2 + "\n Apellido1=" + ape 
        		+ "\n Apellido2=" + ape2 + "\n Sexo=" + s + "\n Año=" + a + "\n Mes=" + m 
        		+ "\n Dia=" + d;
    }
    
    public void CreaCurp()
    {
    	String V=ape.toUpperCase();
    	String V1=ape2.toUpperCase();
    	String V2=nom.toUpperCase();
    	String guardar=new String();
    	String A=new String();
    	char ap,ap2,v=0,v1=0,v2=0,n,v3=0;
    	int na=0,na2=0,rs;
    	Scanner R = new Scanner(System.in);
    	Residencia.opciones();
    	rs=R.nextInt();
    	String r2=Residencia.s(rs);
    	Random r=new Random();
    	na=(int)(r.nextDouble()*9);
    	na2=(int)(r.nextDouble()*9);
    	ap=V.charAt(0);
    	ap2=V1.charAt(0);
    	n=V2.charAt(0);
    	A=A+a.charAt(2)+a.charAt(3);
    	for(int i=1;i<ape.length();i++)
    	{
    		v=V.charAt(i);
    		if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
    		{
    			break;
    		}
    	}
    	
    	for(int i=1;i<ape2.length();i++)
    	{
    		v2=V.charAt(i);
    		if(v2!='A'&&v2!='E'&&v2!='I'&&v2!='O'&&v2!='U')
    		{
    			break;
    		}
    	}
    	for(int i=1;i<ape2.length();i++)
    	{
    		v1=V1.charAt(i);
    		if(v1!='A'&&v1!='E'&&v1!='I'&&v1!='O'&&v1!='U')
    		{
    			break;
    		}
    	}
    	for(int i=1;i<nom.length();i++)
    	{
    		v3=V2.charAt(i);
    		if(v3!='A'&&v3!='E'&&v3!='I'&&v3!='O'&&v3!='U')
    		{
    			break;
    		}
    	}
    	guardar=guardar + ap + v + ap2 + n + A + m + d + s + r2 + v2 + v1 + v3 + na + na2;
    	System.out.println("\nCURP: " + guardar);
    	this.curp=guardar;
    }
    
    public void Crearfc()
    {
    	String V=ape.toUpperCase();
    	String V1=ape2.toUpperCase();
    	String V2=nom.toUpperCase();
    	String guardar=new String();
    	String A=new String();
    	char ap,ap2,v=0,n;
    	int na=0,na2=0,na3=0;
    	Random r=new Random();
    	na=(int)(r.nextDouble()*9);
    	na2=(int)(r.nextDouble()*9);
    	na3=(int)(r.nextDouble()*9);
    	ap=V.charAt(0);
    	ap2=V1.charAt(0);
    	n=V2.charAt(0);
    	A=A+a.charAt(2)+a.charAt(3);
    	for(int i=1;i<ape.length();i++)
    	{
    		v=V.charAt(i);
    		if(v=='A'||v=='E'||v=='I'||v=='O'||v=='U')
    		{
    			break;
    		}
    	}
    	
    	guardar=guardar + ap + v + ap2 + n + A + m + d + na + na2 + na3;
    	System.out.println("\nRFC: " + guardar);
    	this.rfc=guardar;
    }
    
}
