package Invoker;
/*the Invoker.Invoker class*/

import Commands.Command;

public class Invoker {

    private Command CreateCommand;
    private Command CalculateCommand;
    private Command StyleCommand;
    private Command MatchCommand;
    private Command RandomCommand;
    private Command InfoCommand;


    public Invoker (Command CreateCommand, Command CalculateCommand, Command StyleCommand, Command MatchCommand, Command RandomCommand, Command InfoCommand)
    {
        this.CreateCommand=CreateCommand;
        this.CalculateCommand=CalculateCommand;
        this.StyleCommand=StyleCommand;
        this.MatchCommand=MatchCommand;
        this.RandomCommand=RandomCommand;
        this.InfoCommand=InfoCommand;
    }

    public void Create(){
        CreateCommand.execute();
    }

    public void Calculate(){
        CalculateCommand.execute();
    }

    public void Style(){
        StyleCommand.execute();
    }

    public void Match(){
        MatchCommand.execute();
    }

    public void Random(){
        RandomCommand.execute();
    }

    public void Info(){
        InfoCommand.execute();
    }
}


