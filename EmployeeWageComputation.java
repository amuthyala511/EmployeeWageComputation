public class EmployeeWageComputation
{
	public static final int IS_PART_TIME=1;
	public static final int IS_FULL_TIME=2;
	public static int ComputeEmpWage(int empWageperHr, int numofWorkingDays, int maxHrsperMonth)
	{
		int empHrs=0, totalEmpHrs=0, totalWorkingDays=0;
		while(totalEmpHrs<=maxHrsperMonth || totalWorkingDays<numofWorkingDays)
		{
			totalWorkingDays++;
			double empCheck=Math.floor(Math.random()*10)%3;
			switch((int)empCheck)
			{
				case IS_PART_TIME:
					empHrs=4;
					System.out.println("Employee worked part time on day "+totalWorkingDays);
					break;
				case IS_FULL_TIME:
					empHrs=8;
					System.out.println("Employee worked full time on day "+totalWorkingDays);
					break;
				default:
					empHrs=0;
					System.out.println("Employee did not work on day "+totalWorkingDays);
					break;
			}
			totalEmpHrs+=empHrs;
			System.out.println("Day "+totalWorkingDays+" employee working hours is: "+empHrs);
			int empWageperDay=empHrs*empWageperHr;
			System.out.println("Day "+totalWorkingDays+" employee wage is: "+empWageperDay);
		}
		int totalEmpWage = totalEmpHrs*empWageperHr;
		System.out.println("Employee total wage per month is: "+totalEmpWage);
		return totalEmpWage;
	}
	public static void main(String[] args)
	{
		System.out.println("WELCOME TO EMPLOYEE WAGE COMPUTATION ON MASTER BRANCH");
		final int IS_PRESENT = 1;
		double empAttendance=Math.floor(Math.random()*10)%2;
		if(empAttendance == IS_PRESENT)
		{
			System.out.println("Employee is Present");
			ComputeEmpWage(20,20,100);
		}
		else
		{
			System.out.println("Employee is Absent");
		}
	}
}
