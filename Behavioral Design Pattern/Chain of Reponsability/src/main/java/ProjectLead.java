//A concrete handler
public class ProjectLead extends Employee
{
    public ProjectLead(LeaveApprover successor)
    {
        super("Project Lead", successor);
    }

    @Override
    protected boolean processRequest(LeaveApplication application)
    {
        // Can only process sick leaves up to 2 days
        if (application.getType() == LeaveApplication.Type.Sick && application.getNoOfDays() <= 2)
        {
            application.approve(getApproverRole());

            return true;
        }

        return false;
    }
}