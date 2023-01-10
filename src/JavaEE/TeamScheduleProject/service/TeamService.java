// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TeamService.java

package TeamScheduleProject.service;

import TeamScheduleProject.domain.*;

// Referenced classes of package TeamScheduleProject.service:
//            TeamException, Status

public class TeamService
{

    public TeamService()
    {
        team = new Programmer[5];
        total = 0;
    }

    public Programmer[] getTeam()
    {
        Programmer team[] = new Programmer[total];
        for(int i = 0; i < total; i++)
            team[i] = this.team[i];

        return team;
    }

    public void addMember(Employee e)
        throws TeamException
    {
        if(total >= 5)
            throw new TeamException("\u6210\u5458\u5DF2\u6EE1,\u65E0\u6CD5\u6DFB\u52A0");
        if(!(e instanceof Programmer))
            throw new TeamException("\u8BE5\u6210\u5458\u4E0D\u662F\u5F00\u53D1\u4EBA\u5458,\u65E0\u6CD5\u6DFB\u52A0");
        Programmer p = (Programmer)e;
        if(isExist(p))
            throw new TeamException("\u8BE5\u6210\u5458\u5DF2\u5728\u5F00\u53D1\u56E2\u961F\u4E2D,\u6DFB\u52A0\u5931\u8D25");
        if(p.getStatus() == Status.BUSY)
            throw new TeamException("\u8BE5\u6210\u5458\u5DF2\u662F\u67D0\u56E2\u961F\u6210\u5458");
        if(p.getStatus() == Status.FREE)
            throw new TeamException("\u8BE5\u5458\u5DE5\u6B63\u5728\u4F11\u5047,\u65E0\u6CD5\u6DFB\u52A0");
        int num[] = getNum();
        int numArchitect = num[0];
        int numDesigner = num[1];
        int numProgrammer = num[2];
        if(p instanceof Architect)
        {
            if(numArchitect >= 1)
                throw new TeamException("\u56E2\u961F\u4E2D\u6700\u591A\u4EC5\u80FD\u6709\u4E00\u540D\u67B6\u6784\u5E08");
            total++;
            team[total] = p;
            p.setMemberId(counter);
            counter++;
            p.setStatus(Status.BUSY);
        } else
        if(p instanceof Designer)
        {
            if(numDesigner >= 2)
                throw new TeamException("\u56E2\u961F\u4E2D\u6700\u591A\u4EC5\u80FD\u6709\u4E24\u540D\u8BBE\u8BA1\u5E08");
            total++;
            team[total] = p;
            p.setMemberId(counter);
            counter++;
            p.setStatus(Status.BUSY);
        } else
        {
            if(numProgrammer >= 3)
                throw new TeamException("\u56E2\u961F\u4E2D\u6700\u591A\u4EC5\u80FD\u6709\u4E09\u540D\u7A0B\u5E8F\u5458");
            total++;
            team[total] = p;
            p.setMemberId(counter);
            counter++;
            p.setStatus(Status.BUSY);
        }
    }

    private int[] getNum()
    {
        int numArchitect = 0;
        int numDesigner = 0;
        int numProgrammer = 0;
        Programmer aprogrammer[] = team;
        int i = aprogrammer.length;
        for(int j = 0; j < i; j++)
        {
            Programmer p = aprogrammer[j];
            if(p instanceof Architect)
            {
                numArchitect++;
                continue;
            }
            if(p instanceof Designer)
                numDesigner++;
            else
                numProgrammer++;
        }

        return (new int[] {
            numArchitect, numDesigner, numProgrammer
        });
    }

    private boolean isExist(Programmer p)
    {
        Programmer aprogrammer[] = team;
        int i = aprogrammer.length;
        for(int j = 0; j < i; j++)
        {
            Programmer pro = aprogrammer[j];
            if(pro == p)
                return true;
        }

        return false;
    }

    public void removeMember(int memberId)
        throws TeamException
    {
        for(int i = 0; i < total; i++)
            if(team[i].getMemberId() == memberId)
            {
                for(int j = i; j < total - 1; j++)
                    team[j] = team[j + 1];

                return;
            }

        throw new TeamException("\u672A\u627E\u5230\u8BE5\u6210\u5458");
    }

    private static int counter = 1;
    private final int MAX_MEMBER = 5;
    private Programmer team[];
    private int total;

}
