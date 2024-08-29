package validation;

import common.CalculationError;
import exception.CalculationException;

public class MinPlanningAmountValidator implements Validator<CalculationException> {

	private Long planningAmount;
	private Long requiredMinPlanningAmount;
	
	private MinPlanningAmountValidator() {
	}
	
	public static MinPlanningAmountValidator prepare() {
		return new MinPlanningAmountValidator();
	}
	
	public MinPlanningAmountValidator withPlanningAmount(Long planningAmount) {
		this.planningAmount = planningAmount;
		return this;
	}
	
	public MinPlanningAmountValidator withRequiredMinPlanningAmount(Long requiredMinPlanningAmount) {
		this.requiredMinPlanningAmount = requiredMinPlanningAmount;
		return this;
	}
	
	@Override
	public void validate() throws CalculationException {
		if (planningAmount <= requiredMinPlanningAmount) {
			throw new CalculationException(CalculationError.LESS_THAN_REQUIRED_MIN_PLANNING_AMOUNT);
		}
	}

}
