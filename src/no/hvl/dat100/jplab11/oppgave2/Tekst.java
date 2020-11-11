package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	private String tekst;
	
	public Tekst () {

	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {
		
		super(id, bruker, dato);
		this.tekst = tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		super(id, bruker, dato, likes);
		this.tekst = tekst;
	}
	
	public String getTekst() {

		return tekst;
	}

	public void setTekst(String tekst) {
		
		this.tekst = tekst;
		
	}

	@Override
	public String toString() {
//		TEKST
//		1
//		Ole Olsen
//		23-10-2019
//		0
//		en tekst
		return ("TEKST\n" + super.getId() + "\n" + super.getBruker() + "\n" + super.getDato() + "\n" + super.getLikes() + "\n" + tekst + "\n");
	
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
		
	}

}