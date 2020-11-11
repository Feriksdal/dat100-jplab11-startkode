package no.hvl.dat100.jplab11.oppgave4;

import java.io.FileNotFoundException;

import java.io.PrintWriter;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		
		boolean printed;
		PrintWriter printing = null;
		
		try {		
			printing = new PrintWriter(filnavn);
			
			for (int i = 0; i < samling.getAntall(); i++) {
				printing.println(samling.getSamling()[i].toString());
			
				}
			
			printed = true;			
			}
		
			catch(Exception e) {

				printed = false;
					}
		
			finally {
				
				if (printing != null)
				
				printing.close();
			}
		
		return printed;

		//throw new UnsupportedOperationException(TODO.method());
	}
}
