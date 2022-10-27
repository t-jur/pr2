package de.bht.pr2.lab01;

import java.util.ArrayList;
import java.util.List;

public class MainProgramm {
	
	public static void main(String[] args) {
		// Daten fuer Studierenden als Strings
		List<String> daten = new ArrayList<String>();
		daten.add("Anna Alt,70001,Medieninformatik,312");
		daten.add("Bob Berg,70002,Technische Informatik,312");
		daten.add("Carla Castor,70003,Druck- und Medientechnik,312");
		daten.add("Daniel Dorf,70004,Screen Based Media,312");
		daten.add("Florian Fein,70005,Technische Informatik,312");
		daten.add("Greta Graf,7-00-06,Medieninformatik,312"); // Falsche Matrikelnummer
		daten.add("Horst Heinz,70008,Screen Based Media,312");
		daten.add("Ingrid Insel,70009,Musik und Tanz,312"); // Falscher Studiengang
		daten.add("Jan Jung,70010,Druck- und Medientechnik,312");
		daten.add("Katrin Keller,70011,Medieninformatik,312");
		daten.add("Leon Lied,70.012,Screen Based Media,312"); // Falsche Matrikelnummer
		daten.add("Melanie Mauer,70013,Technische Informatik,312");
		daten.add("Nick Nuss,70014,Medieninformatik,312");
		daten.add("Olivia Oper,70015,Druck- und Medientechnik,312");
		daten.add("Peter Preis,70016,Screen Based Media,312");
		daten.add("Queeny Quadrat,70017,Screen Based Media,312");
		daten.add("Rafael Raum,70018,Druck- und Medientechnik,200"); // Zu wenig bezahlt
		daten.add("Sara Sauer,70019,Technische Informatik,312");
		daten.add("Thomas Tanne,70020,Medieninformatik,312");
		daten.add("Ute Ulrich,70021,Screen Based Media,312");
		daten.add("Vera Vesper,70022,Medieninformatik,312");
		daten.add("Walter Welt,70023,Medieninformatik"); // Zu wenig Daten
		daten.add("Xena Xylophon,70024,Screen Based Media,312");
		daten.add("Yannik Yoga,70025,Druck- und Medientechnik,312");
		daten.add("Zoe Zoo,70026,Technische Informatik,312");
		
		// Eine leere Liste von Student-Objekte erzeugen
		List<Student> studenten = new ArrayList<Student>();
		
		// Zeile fuer Zeile mit den Daten arbeiten,
		// damit einen Student-Objekt erzeugen und in die
		// Liste einfuegen
		for (String datenZeile : daten) {
			//---------------------------
			// Beginn: Schreiben bzw. aendern Sie den Code AB hier
			//---------------------------
			try {
				Student student = new Student(datenZeile);
				studenten.add(student);
			} catch(StudentParseException | WrongCourseOfStudiesException | NotPaidTuitionFeeException | RegistrationNumberException e){
				System.out.println(e.getMessage());
			}
			
			//---------------------------
			// Ende: Schreiben bzw. aendern Sie den Code BIS hier
			//---------------------------
		}
		
		// Zur Bestaetigung, die Liste in der Console drucken
		System.out.println("Liste von Student-Objekten:");
		for (Student student : studenten) {
			System.out.println(student);
		}
	}
}
