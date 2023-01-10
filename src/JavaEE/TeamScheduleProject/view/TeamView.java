// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TeamView.java

package TeamScheduleProject.view;

import TeamScheduleProject.domain.Employee;
import TeamScheduleProject.service.NameListService;
import TeamScheduleProject.service.TeamService;
import java.io.PrintStream;

// Referenced classes of package TeamScheduleProject.view:
//            TSUtility

public class TeamView
{

    public TeamView()
    {
        listSvc = new NameListService();
        teamSvc = new TeamService();
    }

    public void enterMainMenu()
    {
        System.out.println("-------------------------------\u5F00\u53D1\u56E2\u961F\u8C03\u5EA6\u8F6F\u4EF6--------------------------");
        System.out.println("ID\t\u59D3\u540D\t\u5E74\u9F84\t\u5DE5\u8D44\t\u804C\u4F4D\t\u72B6\u6001\t\u5956\u91D1\t\u80A1\u7968\t\u9886\u7528\u8BBE\u5907");
        listAllEmployees();
        System.out.println("------------------------------------------------------------------------");
        System.out.println("1-\u56E2\u961F\u5217\u8868\t2-\u6DFB\u52A0\u56E2\u961F\u6210\u5458\t3-\u5220\u9664\u56E2\u961F\u6210\u5458\t4-\u9000\u51FA\t\u8BF7\u9009\u62E9(1-4): ");
        char c = TSUtility.readMenuSelection();
        switch(c)
        {
        case 49: // '1'
            getTeam();
            // fall through

        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        default:
            return;
        }
    }

    private void listAllEmployees()
    {
        Employee employees[] = listSvc.getAllEmployees();
        Employee aemployee[] = employees;
        int i = aemployee.length;
        for(int j = 0; j < i; j++)
        {
            Employee e = aemployee[j];
            System.out.println(e.toString());
        }

    }

    private void getTeam()
    {
    }

    private void addMember()
    {
    }

    private void deleteMember()
    {
    }

    public static void main(String args[])
    {
        TeamView teamView = new TeamView();
        teamView.listAllEmployees();
    }

    private NameListService listSvc;
    private TeamService teamSvc;
}
