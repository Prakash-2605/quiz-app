@RestController
@RequestMapping("/quiz")
public class QuizController {

    List<Question> questions = new ArrayList<>();

    public QuizController() {
        questions.add(new Question(1, "Capital of India?", "Delhi", "Mumbai", "Chennai", "Kolkata", "Delhi"));
        questions.add(new Question(2, "2 + 2 = ?", "3", "4", "5", "6", "4"));
    }

    @GetMapping("/all")
    public List<Question> getQuestions() {
        return questions;
    }

    @PostMapping("/add")
    public String addQuestion(@RequestBody Question question) {
        questions.add(question);
        return "Question added successfully!";
    }
}