package lab21;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lab21.model.Doctor;
import lab21.model.DoctorRepository;
import lab21.model.Drug;
import lab21.model.DrugRepository;
import lab21.model.Patient;
import lab21.model.PatientRepository;
import lab21.model.Prescription;
import lab21.model.PrescriptionRepository;
import lab21.service.SequenceService;
import lab21.view.PrescriptionView;

@Controller
public class ControllerPrescriptionCreate {

	@Autowired
	DoctorRepository doctorRepository;

	@Autowired
	PatientRepository patientRepository;

	@Autowired
	DrugRepository drugRepository;
	
	@Autowired
	PrescriptionRepository prescriptionRepository;
	
	@Autowired
	SequenceService sequence;
	/*
	 * Doctor requests blank form for new prescription.
	 */
	@GetMapping("/prescription/new")
	public String getPrescriptionForm(Model model) {
		model.addAttribute("prescription", new PrescriptionView());
		return "prescription_create";
	}

	@PostMapping("/prescription")
	public String createPrescription(PrescriptionView p, Model model) {

		// TODO 

		/*
		 * valid doctor name and id
		 */


		// TODO 
		
		/*
		 * valid patient name and id
		 */

		// TODO 
		

		/*
		 * valid drug name
		 */
	

		/*
		 * insert prescription  
		 */
	

		model.addAttribute("message", "Prescription created.");
		model.addAttribute("prescription", p);
		return "prescription_show";
	}

}
