import java.time.LocalDate;

public class Client
{
    public static void main(String[] args)
    {
        LeaveApplication application = LeaveApplication.getBuilder().withType(LeaveApplication.Type.Sick)
                .from(LocalDate.now())
                .to(LocalDate.of(2023, 2, 23))
                .build();

        System.out.println(application);
        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
        System.out.println(application);
    }

    private static LeaveApprover createChain()
    {
        Director director = new Director(null);
        Manager manager = new Manager(director);

        return new ProjectLead(manager);
    }
}
