package lab21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lab21.model.DoctorRepository;
import lab21.model.PatientRepository;
import lab21.service.SequenceService;
import lab21.view.PatientView;

/*
 * Controller class for patient interactions.
 *   register as a new patient.
 *   update patient profile.
 */
@Controller
public class ControllerPatientCreate {
	
	@Autowired
	PatientRepository patientRepository;
	
	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	SequenceService sequence;
	
	/*
	 * Request blank patient registration form.
	 */
	@GetMapping("/patient/new")
	public String getNewPatientForm(Model model) {
		// return blank form for new patient registration
		model.addAttribute("patient", new PatientView());
		return "patient_register";
	}
	
	/*
	 * Process new patient registration
	 */
	@PostMapping("/patient/new")
	public String createPatient(PatientView p, Model model) {

		/*
		 * validate doctor last name
		 */
		// TODO 

		/*
		 * insert patient to mongo collection
		 */	
		// TODO  hint:  use Patient.fromView( ) to create entity class


		// display generated ID, message
		model.addAttribute("message", "Registration successful.");
		
		// TODO update p with the patient id 
		
		model.addAttribute("patient", p);
		return "patient_show";
	}
	
	/*
	 * Request blank form to search for patient by and and id
	 */
	@GetMapping("/patient/edit")
	public String getSearchForm(Model model) {
		model.addAttribute("patient", new PatientView());
		return "patient_get";
	}
	
	/*
	 * Perform search for patient by patient id and name.
	 */
	@PostMapping("/patient/show")
	public String showPatient(PatientView p, Model model) {

		// TODO   search for patient by id and name
		
		// if found, return "patient_show", else return "patient_get"
		
		return "patient_show";
	}
}
