import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TradeController {

    @PostMapping("/calculateForward")
    public String calculateForward(
            @RequestParam double listeneinkaufspreis,
            @RequestParam double umsatzsteuer,
            @RequestParam double lieferrabatt,
            @RequestParam double lieferskonto,
            @RequestParam double bezugskosten,
            @RequestParam double handlungskosten,
            @RequestParam double gewinn,
            @RequestParam double kundenskonto,
            @RequestParam double kundenrabatt,
            Model model) {

        // Implementiere die Vorwärtskalkulation hier

        // Beispiel: Einfach die Eingaben wieder in die Ergebnisse übergeben
        model.addAttribute("listeneinkaufspreis", listeneinkaufspreis);
        model.addAttribute("umsatzsteuer", umsatzsteuer);
        // Füge weitere Ergebnisse hinzu

        return "result";
    }
}

