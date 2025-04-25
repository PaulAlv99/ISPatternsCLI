package si.um.feri.cli.example1;

import si.um.feri.aiv.ejb.PatientsWithoutDoctorRemote;
import si.um.feri.aiv.vao.Patient;
import si.um.feri.cli.MyInitialContextFactory;

import java.util.ArrayList;

public class EjbTest {

	public static void main(String[] args) throws Exception {
		PatientsWithoutDoctorRemote patientsWithoutDoctor =
				(PatientsWithoutDoctorRemote) MyInitialContextFactory.getInitialContext()
						.lookup("sampleProject/PatientsWithoutDoctorBean!si.um.feri.aiv.ejb.PatientsWithoutDoctorRemote");

		ArrayList<Patient> patients = patientsWithoutDoctor.getPatientsWithoutDoctor();

		for (Patient p : patients) {
			System.out.println(p.getFirstName() + " " + p.getSurname() + " (" + p.getEmail() + ")");
		}
	}
}
