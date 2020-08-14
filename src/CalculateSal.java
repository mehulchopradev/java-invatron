import com.abc.college.Professor;
import com.pqr.SalariedIndividual;

public class CalculateSal {
    public static void main(String[] args) {
        Professor p = new Professor("mehul", 'm', null);
        p.setNoOfDays(22);
        p.setCostPerDay(10000);

        // System.out.println(SalaryCalculator.calculate(p));

        System.out.println(p.calculate());
        System.out.println(p.isEligibleForTaxDeduction());

        System.out.println(SalariedIndividual.getTaxStructure());
        System.out.println(SalariedIndividual.TAX_BARRIER);
    }
}
