package main;

public class DefaultWorldBuilder 
{
	public DefaultWorldBuilder()
	{
		
	}
	
	public void Build()
	{
        BuildScreen0();
        BuildScreen1();
        BuildScreen2();
        BuildScreen3();
        BuildScreen4();
        BuildScreen5();
        BuildScreen6();
        BuildScreen7();
        BuildScreen8();
        BuildScreen9();
        BuildScreen10();
        BuildScreen11();
        BuildScreen12();
        BuildScreen13();
        BuildScreen14();
        BuildScreen15();
        BuildScreen16();
        BuildScreen17();
        BuildScreen18();
        BuildScreen19();
        BuildScreen20();
        BuildScreen21();
        BuildScreen22();
        BuildScreen23();
        BuildScreen24();		
	}
	
    public void BuildScreen0()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(0, 0));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));
        commands.AddLast(new AddTreeCommand(2, 7, 0));
        commands.AddLast(new AddTreeCommand(2, 8, 0));
        commands.AddLast(new AddTreeCommand(2, 9, 0));
        commands.AddLast(new AddTreeCommand(2, 10, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));
        commands.AddLast(new AddTreeCommand(2, 7, 1));
        commands.AddLast(new AddTreeCommand(2, 8, 1));
        commands.AddLast(new AddTreeCommand(2, 9, 1));
        commands.AddLast(new AddTreeCommand(2, 10, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));

        commands.AddLast(new AddTreeCommand(2, 0, 7));
        commands.AddLast(new AddTreeCommand(2, 0, 8));

        commands.AddLast(new AddTreeCommand(2, 1, 7));
        commands.AddLast(new AddTreeCommand(2, 1, 8));



        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 13, 5));
        commands.AddLast(new AddTreeCommand(2, 14, 5));
        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 1));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 1));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 1));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 5));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 5));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 5));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 5));    	
*/        
    }
    
    public void BuildScreen1()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(1, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 0));
        commands.AddLast(new AddStoneWallCommand(2, 1, 0));
        commands.AddLast(new AddStoneWallCommand(2, 2, 0));
        commands.AddLast(new AddStoneWallCommand(2, 3, 0));
        commands.AddLast(new AddStoneWallCommand(2, 4, 0));
        commands.AddLast(new AddStoneWallCommand(2, 5, 0));
        commands.AddLast(new AddStoneWallCommand(2, 6, 0));
        commands.AddLast(new AddStoneWallCommand(2, 7, 0));
        commands.AddLast(new AddStoneWallCommand(2, 8, 0));
        commands.AddLast(new AddStoneWallCommand(2, 9, 0));
        commands.AddLast(new AddStoneWallCommand(2, 10, 0));
        commands.AddLast(new AddStoneWallCommand(2, 11, 0));
        commands.AddLast(new AddStoneWallCommand(2, 12, 0));
        commands.AddLast(new AddStoneWallCommand(2, 13, 0));
        commands.AddLast(new AddStoneWallCommand(2, 14, 0));
        commands.AddLast(new AddStoneWallCommand(2, 15, 0));
        commands.AddLast(new AddStoneWallCommand(2, 16, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 1));
        commands.AddLast(new AddStoneWallCommand(2, 1, 1));
        commands.AddLast(new AddStoneWallCommand(2, 2, 1));
        commands.AddLast(new AddStoneWallCommand(2, 3, 1));
        commands.AddLast(new AddStoneWallCommand(2, 4, 1));
        commands.AddLast(new AddStoneWallCommand(2, 5, 1));
        commands.AddLast(new AddStoneWallCommand(2, 6, 1));
        commands.AddLast(new AddStoneWallCommand(2, 7, 1));
        commands.AddLast(new AddStoneWallCommand(2, 8, 1));
        commands.AddLast(new AddStoneWallCommand(2, 9, 1));
        commands.AddLast(new AddStoneWallCommand(2, 10, 1));
        commands.AddLast(new AddStoneWallCommand(2, 11, 1));
        commands.AddLast(new AddStoneWallCommand(2, 12, 1));
        commands.AddLast(new AddStoneWallCommand(2, 13, 1));
        commands.AddLast(new AddStoneWallCommand(2, 14, 1));
        commands.AddLast(new AddStoneWallCommand(2, 15, 1));
        commands.AddLast(new AddStoneWallCommand(2, 16, 1));

        commands.AddLast(new AddStoneWallCommand(2, 0, 2));
        commands.AddLast(new AddStoneWallCommand(2, 1, 2));
        commands.AddLast(new AddStoneWallCommand(2, 15, 2));
        commands.AddLast(new AddStoneWallCommand(2, 16, 2));

        commands.AddLast(new AddStoneWallCommand(2, 0, 3));
        commands.AddLast(new AddStoneWallCommand(2, 1, 3));
        commands.AddLast(new AddStoneWallCommand(2, 15, 3));
        commands.AddLast(new AddStoneWallCommand(2, 16, 3));

        commands.AddLast(new AddStoneWallCommand(2, 0, 4));
        commands.AddLast(new AddStoneWallCommand(2, 1, 4));
        commands.AddLast(new AddStoneWallCommand(2, 15, 4));
        commands.AddLast(new AddStoneWallCommand(2, 16, 4));

        commands.AddLast(new AddStoneWallCommand(2, 0, 5));
        commands.AddLast(new AddStoneWallCommand(2, 1, 5));
        commands.AddLast(new AddStoneWallCommand(2, 15, 5));
        commands.AddLast(new AddStoneWallCommand(2, 16, 5));


        commands.AddLast(new AddStoneWallCommand(2, 0, 9));
        commands.AddLast(new AddStoneWallCommand(2, 1, 9));
        commands.AddLast(new AddStoneWallCommand(2, 15, 9));
        commands.AddLast(new AddStoneWallCommand(2, 16, 9));

        commands.AddLast(new AddStoneWallCommand(2, 0, 10));
        commands.AddLast(new AddStoneWallCommand(2, 1, 10));
        commands.AddLast(new AddStoneWallCommand(2, 15, 10));
        commands.AddLast(new AddStoneWallCommand(2, 16, 10));

        commands.AddLast(new AddStoneWallCommand(2, 0, 11));
        commands.AddLast(new AddStoneWallCommand(2, 1, 11));
        commands.AddLast(new AddStoneWallCommand(2, 15, 11));
        commands.AddLast(new AddStoneWallCommand(2, 16, 11));

        commands.AddLast(new AddStoneWallCommand(2, 0, 12));
        commands.AddLast(new AddStoneWallCommand(2, 1, 12));
        commands.AddLast(new AddStoneWallCommand(2, 15, 12));
        commands.AddLast(new AddStoneWallCommand(2, 16, 12));

        commands.AddLast(new AddStoneWallCommand(2, 0, 13));
        commands.AddLast(new AddStoneWallCommand(2, 1, 13));
        commands.AddLast(new AddStoneWallCommand(2, 15, 13));
        commands.AddLast(new AddStoneWallCommand(2, 16, 13));



        commands.AddLast(new AddStoneWallCommand(2, 0, 13));
        commands.AddLast(new AddStoneWallCommand(2, 1, 13));
        commands.AddLast(new AddStoneWallCommand(2, 2, 13));
        commands.AddLast(new AddStoneWallCommand(2, 3, 13));
        commands.AddLast(new AddStoneWallCommand(2, 4, 13));
        commands.AddLast(new AddStoneWallCommand(2, 5, 13));
        commands.AddLast(new AddStoneWallCommand(2, 6, 13));
        commands.AddLast(new AddStoneWallCommand(2, 10, 13));
        commands.AddLast(new AddStoneWallCommand(2, 11, 13));
        commands.AddLast(new AddStoneWallCommand(2, 12, 13));
        commands.AddLast(new AddStoneWallCommand(2, 13, 13));
        commands.AddLast(new AddStoneWallCommand(2, 14, 13));
        commands.AddLast(new AddStoneWallCommand(2, 15, 13));

        commands.AddLast(new AddStoneWallCommand(2, 0, 14));
        commands.AddLast(new AddStoneWallCommand(2, 1, 14));
        commands.AddLast(new AddStoneWallCommand(2, 2, 14));
        commands.AddLast(new AddStoneWallCommand(2, 3, 14));
        commands.AddLast(new AddStoneWallCommand(2, 4, 14));
        commands.AddLast(new AddStoneWallCommand(2, 5, 14));
        commands.AddLast(new AddStoneWallCommand(2, 6, 14));
        commands.AddLast(new AddStoneWallCommand(2, 10, 14));
        commands.AddLast(new AddStoneWallCommand(2, 11, 14));
        commands.AddLast(new AddStoneWallCommand(2, 12, 14));
        commands.AddLast(new AddStoneWallCommand(2, 13, 14));
        commands.AddLast(new AddStoneWallCommand(2, 14, 14));
        commands.AddLast(new AddStoneWallCommand(2, 15, 14));

        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 7, 3));
        commands.AddLast(new AddTreeCommand(2, 9, 3));
        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));

        commands.AddLast(new AddTreeCommand(2, 3, 5));
        commands.AddLast(new AddTreeCommand(2, 5, 5));
        commands.AddLast(new AddTreeCommand(2, 7, 5));
        commands.AddLast(new AddTreeCommand(2, 9, 5));
        commands.AddLast(new AddTreeCommand(2, 11, 5));
        commands.AddLast(new AddTreeCommand(2, 13, 5));

        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 5, 9));
        commands.AddLast(new AddTreeCommand(2, 7, 9));
        commands.AddLast(new AddTreeCommand(2, 9, 9));
        commands.AddLast(new AddTreeCommand(2, 11, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));

        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 7, 11));
        commands.AddLast(new AddTreeCommand(2, 9, 11));
        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));



        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 0));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 0));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 0));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 6));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 6));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 6));

        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 2));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 2));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 2));   
         	*/
    }
    
    public void BuildScreen2()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(2, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 0));
        commands.AddLast(new AddStoneWallCommand(2, 1, 0));
        commands.AddLast(new AddStoneWallCommand(2, 2, 0));
        commands.AddLast(new AddStoneWallCommand(2, 3, 0));
        commands.AddLast(new AddStoneWallCommand(2, 4, 0));
        commands.AddLast(new AddStoneWallCommand(2, 5, 0));
        commands.AddLast(new AddStoneWallCommand(2, 6, 0));
        commands.AddLast(new AddStoneWallCommand(2, 7, 0));
        commands.AddLast(new AddStoneWallCommand(2, 8, 0));
        commands.AddLast(new AddStoneWallCommand(2, 9, 0));
        commands.AddLast(new AddStoneWallCommand(2, 10, 0));
        commands.AddLast(new AddStoneWallCommand(2, 11, 0));
        commands.AddLast(new AddStoneWallCommand(2, 12, 0));
        commands.AddLast(new AddStoneWallCommand(2, 13, 0));
        commands.AddLast(new AddStoneWallCommand(2, 14, 0));
        commands.AddLast(new AddStoneWallCommand(2, 15, 0));
        commands.AddLast(new AddStoneWallCommand(2, 16, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 1));
        commands.AddLast(new AddStoneWallCommand(2, 1, 1));
        commands.AddLast(new AddStoneWallCommand(2, 2, 1));
        commands.AddLast(new AddStoneWallCommand(2, 3, 1));
        commands.AddLast(new AddStoneWallCommand(2, 4, 1));
        commands.AddLast(new AddStoneWallCommand(2, 5, 1));
        commands.AddLast(new AddStoneWallCommand(2, 6, 1));
        commands.AddLast(new AddStoneWallCommand(2, 7, 1));
        commands.AddLast(new AddStoneWallCommand(2, 8, 1));
        commands.AddLast(new AddStoneWallCommand(2, 9, 1));
        commands.AddLast(new AddStoneWallCommand(2, 10, 1));
        commands.AddLast(new AddStoneWallCommand(2, 11, 1));
        commands.AddLast(new AddStoneWallCommand(2, 12, 1));
        commands.AddLast(new AddStoneWallCommand(2, 13, 1));
        commands.AddLast(new AddStoneWallCommand(2, 14, 1));
        commands.AddLast(new AddStoneWallCommand(2, 15, 1));
        commands.AddLast(new AddStoneWallCommand(2, 16, 1));

        commands.AddLast(new AddStoneWallCommand(2, 0, 2));
        commands.AddLast(new AddStoneWallCommand(2, 1, 2));
        commands.AddLast(new AddWaterCommand(2, 15, 2));
        commands.AddLast(new AddWaterCommand(2, 16, 2));

        commands.AddLast(new AddStoneWallCommand(2, 0, 3));
        commands.AddLast(new AddStoneWallCommand(2, 1, 3));
        commands.AddLast(new AddStoneWallCommand(2, 15, 3));
        commands.AddLast(new AddStoneWallCommand(2, 16, 3));

        commands.AddLast(new AddStoneWallCommand(2, 0, 4));
        commands.AddLast(new AddStoneWallCommand(2, 1, 4));
        commands.AddLast(new AddStoneWallCommand(2, 15, 4));
        commands.AddLast(new AddStoneWallCommand(2, 16, 4));

        commands.AddLast(new AddStoneWallCommand(2, 0, 5));
        commands.AddLast(new AddStoneWallCommand(2, 1, 5));
        commands.AddLast(new AddStoneWallCommand(2, 15, 5));
        commands.AddLast(new AddStoneWallCommand(2, 16, 5));

        commands.AddLast(new AddStoneWallCommand(2, 15, 6));
        commands.AddLast(new AddStoneWallCommand(2, 16, 6));

        commands.AddLast(new AddStoneWallCommand(2, 15, 7));
        commands.AddLast(new AddStoneWallCommand(2, 16, 7));

        commands.AddLast(new AddStoneWallCommand(2, 15, 8));
        commands.AddLast(new AddStoneWallCommand(2, 16, 8));


        commands.AddLast(new AddStoneWallCommand(2, 0, 9));
        commands.AddLast(new AddStoneWallCommand(2, 1, 9));
        commands.AddLast(new AddStoneWallCommand(2, 15, 9));
        commands.AddLast(new AddStoneWallCommand(2, 16, 9));

        commands.AddLast(new AddStoneWallCommand(2, 0, 10));
        commands.AddLast(new AddStoneWallCommand(2, 1, 10));
        commands.AddLast(new AddStoneWallCommand(2, 15, 10));
        commands.AddLast(new AddStoneWallCommand(2, 16, 10));

        commands.AddLast(new AddStoneWallCommand(2, 0, 11));
        commands.AddLast(new AddStoneWallCommand(2, 1, 11));
        commands.AddLast(new AddStoneWallCommand(2, 15, 11));
        commands.AddLast(new AddStoneWallCommand(2, 16, 11));

        commands.AddLast(new AddStoneWallCommand(2, 0, 12));
        commands.AddLast(new AddStoneWallCommand(2, 1, 12));
        commands.AddLast(new AddStoneWallCommand(2, 15, 12));
        commands.AddLast(new AddStoneWallCommand(2, 16, 12));

        commands.AddLast(new AddStoneWallCommand(2, 0, 13));
        commands.AddLast(new AddStoneWallCommand(2, 1, 13));
        commands.AddLast(new AddStoneWallCommand(2, 15, 13));
        commands.AddLast(new AddStoneWallCommand(2, 16, 13));



        commands.AddLast(new AddStoneWallCommand(2, 0, 13));
        commands.AddLast(new AddStoneWallCommand(2, 1, 13));
        commands.AddLast(new AddStoneWallCommand(2, 2, 13));
        commands.AddLast(new AddStoneWallCommand(2, 3, 13));
        commands.AddLast(new AddStoneWallCommand(2, 4, 13));
        commands.AddLast(new AddStoneWallCommand(2, 5, 13));
        commands.AddLast(new AddStoneWallCommand(2, 6, 13));
        commands.AddLast(new AddStoneWallCommand(2, 7, 13));
        commands.AddLast(new AddStoneWallCommand(2, 8, 13));
        commands.AddLast(new AddStoneWallCommand(2, 9, 13));
        commands.AddLast(new AddStoneWallCommand(2, 10, 13));
        commands.AddLast(new AddWaterCommand(2, 11, 13));
        commands.AddLast(new AddWaterCommand(2, 12, 13));
        commands.AddLast(new AddWaterCommand(2, 13, 13));
        commands.AddLast(new AddStoneWallCommand(2, 14, 13));
        commands.AddLast(new AddStoneWallCommand(2, 15, 13));

        commands.AddLast(new AddStoneWallCommand(2, 0, 14));
        commands.AddLast(new AddStoneWallCommand(2, 1, 14));
        commands.AddLast(new AddStoneWallCommand(2, 2, 14));
        commands.AddLast(new AddStoneWallCommand(2, 3, 14));
        commands.AddLast(new AddStoneWallCommand(2, 4, 14));
        commands.AddLast(new AddStoneWallCommand(2, 5, 14));
        commands.AddLast(new AddStoneWallCommand(2, 6, 14));
        commands.AddLast(new AddStoneWallCommand(2, 7, 14));
        commands.AddLast(new AddStoneWallCommand(2, 8, 14));
        commands.AddLast(new AddStoneWallCommand(2, 9, 14));
        commands.AddLast(new AddStoneWallCommand(2, 10, 14));
        commands.AddLast(new AddWaterCommand(2, 11, 14));
        commands.AddLast(new AddWaterCommand(2, 12, 14));
        commands.AddLast(new AddWaterCommand(2, 13, 14));
        commands.AddLast(new AddStoneWallCommand(2, 14, 14));
        commands.AddLast(new AddStoneWallCommand(2, 15, 14));
        commands.AddLast(new AddStoneWallCommand(2, 16, 14));




        commands.AddLast(new AddWaterCommand(2, 2, 2));
        commands.AddLast(new AddWaterCommand(2, 3, 2));
        commands.AddLast(new AddWaterCommand(2, 4, 2));
        commands.AddLast(new AddWaterCommand(2, 5, 2));
        commands.AddLast(new AddWaterCommand(2, 6, 2));
        commands.AddLast(new AddWaterCommand(2, 7, 2));
        commands.AddLast(new AddWaterCommand(2, 8, 2));
        commands.AddLast(new AddWaterCommand(2, 9, 2));
        commands.AddLast(new AddWaterCommand(2, 10, 2));
        commands.AddLast(new AddWaterCommand(2, 11, 2));
        commands.AddLast(new AddWaterCommand(2, 12, 2));
        commands.AddLast(new AddWaterCommand(2, 13, 2));
        commands.AddLast(new AddWaterCommand(2, 14, 2));

        commands.AddLast(new AddWaterCommand(2, 2, 3));
        commands.AddLast(new AddWaterCommand(2, 3, 3));
        commands.AddLast(new AddWaterCommand(2, 4, 3));
        commands.AddLast(new AddWaterCommand(2, 5, 3));
        commands.AddLast(new AddWaterCommand(2, 6, 3));
        commands.AddLast(new AddWaterCommand(2, 7, 3));
        commands.AddLast(new AddWaterCommand(2, 8, 3));
        commands.AddLast(new AddWaterCommand(2, 9, 3));
        commands.AddLast(new AddWaterCommand(2, 10, 3));
        commands.AddLast(new AddWaterCommand(2, 11, 3));
        commands.AddLast(new AddWaterCommand(2, 12, 3));
        commands.AddLast(new AddWaterCommand(2, 13, 3));
        commands.AddLast(new AddWaterCommand(2, 14, 3));

        commands.AddLast(new AddWaterCommand(2, 2, 4));
        commands.AddLast(new AddWaterCommand(2, 3, 4));
        commands.AddLast(new AddWaterCommand(2, 4, 4));
        commands.AddLast(new AddWaterCommand(2, 5, 4));
        commands.AddLast(new AddWaterCommand(2, 6, 4));
        commands.AddLast(new AddWaterCommand(2, 7, 4));
        commands.AddLast(new AddWaterCommand(2, 8, 4));
        commands.AddLast(new AddWaterCommand(2, 9, 4));
        commands.AddLast(new AddWaterCommand(2, 10, 4));
        commands.AddLast(new AddWaterCommand(2, 11, 4));
        commands.AddLast(new AddWaterCommand(2, 12, 4));
        commands.AddLast(new AddWaterCommand(2, 13, 4));
        commands.AddLast(new AddWaterCommand(2, 14, 4));

        commands.AddLast(new AddWaterCommand(2, 2, 5));
        commands.AddLast(new AddWaterCommand(2, 3, 5));
        commands.AddLast(new AddWaterCommand(2, 4, 5));
        commands.AddLast(new AddWaterCommand(2, 5, 5));
        commands.AddLast(new AddWaterCommand(2, 6, 5));
        commands.AddLast(new AddWaterCommand(2, 10, 5));
        commands.AddLast(new AddWaterCommand(2, 11, 5));
        commands.AddLast(new AddWaterCommand(2, 12, 5));
        commands.AddLast(new AddWaterCommand(2, 13, 5));
        commands.AddLast(new AddWaterCommand(2, 14, 5));





        commands.AddLast(new AddWaterCommand(2, 2, 9));
        commands.AddLast(new AddWaterCommand(2, 3, 9));
        commands.AddLast(new AddWaterCommand(2, 4, 9));
        commands.AddLast(new AddWaterCommand(2, 5, 9));
        commands.AddLast(new AddWaterCommand(2, 6, 9));
        commands.AddLast(new AddWaterCommand(2, 10, 9));
        commands.AddLast(new AddWaterCommand(2, 11, 9));
        commands.AddLast(new AddWaterCommand(2, 12, 9));
        commands.AddLast(new AddWaterCommand(2, 13, 9));
        commands.AddLast(new AddWaterCommand(2, 14, 9));

        commands.AddLast(new AddWaterCommand(2, 2, 10));
        commands.AddLast(new AddWaterCommand(2, 3, 10));
        commands.AddLast(new AddWaterCommand(2, 4, 10));
        commands.AddLast(new AddWaterCommand(2, 5, 10));
        commands.AddLast(new AddWaterCommand(2, 6, 10));
        commands.AddLast(new AddWaterCommand(2, 7, 10));
        commands.AddLast(new AddWaterCommand(2, 8, 10));
        commands.AddLast(new AddWaterCommand(2, 9, 10));
        commands.AddLast(new AddWaterCommand(2, 10, 10));
        commands.AddLast(new AddWaterCommand(2, 11, 10));
        commands.AddLast(new AddWaterCommand(2, 12, 10));
        commands.AddLast(new AddWaterCommand(2, 13, 10));
        commands.AddLast(new AddWaterCommand(2, 14, 10));

        commands.AddLast(new AddWaterCommand(2, 2, 11));
        commands.AddLast(new AddWaterCommand(2, 3, 11));
        commands.AddLast(new AddWaterCommand(2, 4, 11));
        commands.AddLast(new AddWaterCommand(2, 5, 11));
        commands.AddLast(new AddWaterCommand(2, 6, 11));
        commands.AddLast(new AddWaterCommand(2, 7, 11));
        commands.AddLast(new AddWaterCommand(2, 8, 11));
        commands.AddLast(new AddWaterCommand(2, 9, 11));
        commands.AddLast(new AddWaterCommand(2, 10, 11));
        commands.AddLast(new AddWaterCommand(2, 11, 11));
        commands.AddLast(new AddWaterCommand(2, 12, 11));
        commands.AddLast(new AddWaterCommand(2, 13, 11));
        commands.AddLast(new AddWaterCommand(2, 14, 11));

        commands.AddLast(new AddWaterCommand(2, 2, 12));
        commands.AddLast(new AddWaterCommand(2, 3, 12));
        commands.AddLast(new AddWaterCommand(2, 4, 12));
        commands.AddLast(new AddWaterCommand(2, 5, 12));
        commands.AddLast(new AddWaterCommand(2, 6, 12));
        commands.AddLast(new AddWaterCommand(2, 7, 12));
        commands.AddLast(new AddWaterCommand(2, 8, 12));
        commands.AddLast(new AddWaterCommand(2, 9, 12));
        commands.AddLast(new AddWaterCommand(2, 10, 12));
        commands.AddLast(new AddWaterCommand(2, 11, 12));
        commands.AddLast(new AddWaterCommand(2, 12, 12));
        commands.AddLast(new AddWaterCommand(2, 13, 12));
        commands.AddLast(new AddWaterCommand(2, 14, 12));


        commands.AddLast(new AddRockCommand(2, 0, 6));
        commands.AddLast(new AddRockCommand(2, 1, 6));
        commands.AddLast(new AddRockCommand(2, 2, 6));
        commands.AddLast(new AddRockCommand(2, 3, 6));
        commands.AddLast(new AddRockCommand(2, 4, 6));
        commands.AddLast(new AddRockCommand(2, 5, 6));
        commands.AddLast(new AddRockCommand(2, 6, 6));
        commands.AddLast(new AddRockCommand(2, 7, 5));
        commands.AddLast(new AddRockCommand(2, 8, 5));
        commands.AddLast(new AddRockCommand(2, 9, 5));
        commands.AddLast(new AddRockCommand(2, 10, 6));

        commands.AddLast(new AddRockCommand(2, 10, 7));

        commands.AddLast(new AddRockCommand(2, 0, 8));
        commands.AddLast(new AddRockCommand(2, 1, 8));
        commands.AddLast(new AddRockCommand(2, 2, 8));
        commands.AddLast(new AddRockCommand(2, 3, 8));
        commands.AddLast(new AddRockCommand(2, 4, 8));
        commands.AddLast(new AddRockCommand(2, 5, 8));
        commands.AddLast(new AddRockCommand(2, 6, 8));
        commands.AddLast(new AddRockCommand(2, 7, 9));
        commands.AddLast(new AddRockCommand(2, 8, 9));
        commands.AddLast(new AddRockCommand(2, 9, 9));
        commands.AddLast(new AddRockCommand(2, 10, 8));


        commands.AddLast(new AddWaterCommand(2, 11, 6));
        commands.AddLast(new AddWaterCommand(2, 12, 6));
        commands.AddLast(new AddWaterCommand(2, 13, 6));
        commands.AddLast(new AddWaterCommand(2, 14, 6));

        commands.AddLast(new AddWaterCommand(2, 11, 7));
        commands.AddLast(new AddWaterCommand(2, 12, 7));
        commands.AddLast(new AddWaterCommand(2, 13, 7));
        commands.AddLast(new AddWaterCommand(2, 14, 7));

        commands.AddLast(new AddWaterCommand(2, 11, 8));
        commands.AddLast(new AddWaterCommand(2, 12, 8));
        commands.AddLast(new AddWaterCommand(2, 13, 8));
        commands.AddLast(new AddWaterCommand(2, 14, 8));












        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 1));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 1));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 1));

*/    	
    }
    
    public void BuildScreen3()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(3, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 0));
        commands.AddLast(new AddStoneWallCommand(2, 1, 0));
        commands.AddLast(new AddStoneWallCommand(2, 2, 0));
        commands.AddLast(new AddStoneWallCommand(2, 3, 0));
        commands.AddLast(new AddStoneWallCommand(2, 4, 0));
        commands.AddLast(new AddStoneWallCommand(2, 5, 0));
        commands.AddLast(new AddStoneWallCommand(2, 6, 0));
        commands.AddLast(new AddStoneWallCommand(2, 7, 0));
        commands.AddLast(new AddStoneWallCommand(2, 8, 0));
        commands.AddLast(new AddStoneWallCommand(2, 9, 0));
        commands.AddLast(new AddStoneWallCommand(2, 10, 0));
        commands.AddLast(new AddStoneWallCommand(2, 11, 0));
        commands.AddLast(new AddStoneWallCommand(2, 12, 0));
        commands.AddLast(new AddStoneWallCommand(2, 13, 0));
        commands.AddLast(new AddStoneWallCommand(2, 14, 0));
        commands.AddLast(new AddStoneWallCommand(2, 15, 0));
        commands.AddLast(new AddStoneWallCommand(2, 16, 0));

        commands.AddLast(new AddWaterCommand(2, 0, 1));
        commands.AddLast(new AddWaterCommand(2, 1, 1));
        commands.AddLast(new AddWaterCommand(2, 2, 1));
        commands.AddLast(new AddWaterCommand(2, 3, 1));
        commands.AddLast(new AddWaterCommand(2, 4, 1));
        commands.AddLast(new AddWaterCommand(2, 5, 1));
        commands.AddLast(new AddWaterCommand(2, 6, 1));
        commands.AddLast(new AddWaterCommand(2, 7, 1));
        commands.AddLast(new AddWaterCommand(2, 8, 1));
        commands.AddLast(new AddWaterCommand(2, 9, 1));
        commands.AddLast(new AddWaterCommand(2, 10, 1));
        commands.AddLast(new AddWaterCommand(2, 11, 1));
        commands.AddLast(new AddWaterCommand(2, 12, 1));
        commands.AddLast(new AddWaterCommand(2, 13, 1));
        commands.AddLast(new AddWaterCommand(2, 14, 1));
        commands.AddLast(new AddWaterCommand(2, 15, 1));
        commands.AddLast(new AddStoneWallCommand(2, 16, 1));

        commands.AddLast(new AddWaterCommand(2, 0, 2));
        commands.AddLast(new AddWaterCommand(2, 1, 2));
        commands.AddLast(new AddWaterCommand(2, 2, 2));
        commands.AddLast(new AddWaterCommand(2, 3, 2));
        commands.AddLast(new AddWaterCommand(2, 4, 2));
        commands.AddLast(new AddWaterCommand(2, 5, 2));
        commands.AddLast(new AddWaterCommand(2, 6, 2));
        commands.AddLast(new AddWaterCommand(2, 7, 2));
        commands.AddLast(new AddWaterCommand(2, 8, 2));
        commands.AddLast(new AddWaterCommand(2, 9, 2));
        commands.AddLast(new AddWaterCommand(2, 10, 2));
        commands.AddLast(new AddWaterCommand(2, 11, 2));
        commands.AddLast(new AddWaterCommand(2, 12, 2));
        commands.AddLast(new AddWaterCommand(2, 13, 2));
        commands.AddLast(new AddWaterCommand(2, 14, 2));
        commands.AddLast(new AddWaterCommand(2, 15, 2));
        commands.AddLast(new AddStoneWallCommand(2, 16, 2));

        commands.AddLast(new AddStoneWallCommand(2, 0, 3));
        commands.AddLast(new AddStoneWallCommand(2, 1, 3));
        commands.AddLast(new AddStoneWallCommand(2, 2, 3));
        commands.AddLast(new AddStoneWallCommand(2, 3, 3));
        commands.AddLast(new AddStoneWallCommand(2, 4, 3));
        commands.AddLast(new AddStoneWallCommand(2, 5, 3));
        commands.AddLast(new AddStoneWallCommand(2, 6, 3));
        commands.AddLast(new AddStoneWallCommand(2, 7, 3));
        commands.AddLast(new AddStoneWallCommand(2, 8, 3));
        commands.AddLast(new AddStoneWallCommand(2, 9, 3));
        commands.AddLast(new AddStoneWallCommand(2, 10, 3));
        commands.AddLast(new AddStoneWallCommand(2, 11, 3));
        commands.AddLast(new AddStoneWallCommand(2, 12, 3));
        commands.AddLast(new AddWaterCommand(2, 13, 3));
        commands.AddLast(new AddWaterCommand(2, 14, 3));
        commands.AddLast(new AddWaterCommand(2, 15, 3));
        commands.AddLast(new AddStoneWallCommand(2, 16, 3));

        commands.AddLast(new AddStoneWallCommand(2, 0, 4));
        commands.AddLast(new AddStoneWallCommand(2, 1, 4));
        commands.AddLast(new AddStoneWallCommand(2, 2, 4));
        commands.AddLast(new AddStoneWallCommand(2, 3, 4));
        commands.AddLast(new AddStoneWallCommand(2, 4, 4));
        commands.AddLast(new AddStoneWallCommand(2, 5, 4));
        commands.AddLast(new AddStoneWallCommand(2, 6, 4));
        commands.AddLast(new AddStoneWallCommand(2, 7, 4));
        commands.AddLast(new AddStoneWallCommand(2, 8, 4));
        commands.AddLast(new AddStoneWallCommand(2, 9, 4));
        commands.AddLast(new AddStoneWallCommand(2, 10, 4));
        commands.AddLast(new AddStoneWallCommand(2, 11, 4));
        commands.AddLast(new AddStoneWallCommand(2, 12, 4));
        commands.AddLast(new AddStoneWallCommand(2, 13, 4));
        commands.AddLast(new AddWaterCommand(2, 14, 4));
        commands.AddLast(new AddWaterCommand(2, 15, 4));
        commands.AddLast(new AddStoneWallCommand(2, 16, 4));

        commands.AddLast(new AddStoneWallCommand(2, 0, 5));
        commands.AddLast(new AddStoneWallCommand(2, 1, 5));
        commands.AddLast(new AddStoneWallCommand(2, 2, 5));
        commands.AddLast(new AddStoneWallCommand(2, 12, 5));
        commands.AddLast(new AddStoneWallCommand(2, 13, 5));
        commands.AddLast(new AddWaterCommand(2, 14, 5));
        commands.AddLast(new AddWaterCommand(2, 15, 5));
        commands.AddLast(new AddWaterCommand(2, 16, 5));

        commands.AddLast(new AddStoneWallCommand(2, 0, 6));
        commands.AddLast(new AddStoneWallCommand(2, 1, 6));
        commands.AddLast(new AddStoneWallCommand(2, 13, 6));
        commands.AddLast(new AddWaterCommand(2, 14, 6));
        commands.AddLast(new AddWaterCommand(2, 15, 6));
        commands.AddLast(new AddWaterCommand(2, 16, 6));

        commands.AddLast(new AddStoneWallCommand(2, 0, 7));
        commands.AddLast(new AddStoneWallCommand(2, 1, 7));
        commands.AddLast(new AddStoneWallCommand(2, 13, 7));
        commands.AddLast(new AddStoneWallCommand(2, 14, 7));
        commands.AddLast(new AddWaterCommand(2, 15, 7));
        commands.AddLast(new AddWaterCommand(2, 16, 7));

        commands.AddLast(new AddStoneWallCommand(2, 0, 8));
        commands.AddLast(new AddStoneWallCommand(2, 1, 8));
        commands.AddLast(new AddStoneWallCommand(2, 14, 8));
        commands.AddLast(new AddWaterCommand(2, 15, 8));
        commands.AddLast(new AddWaterCommand(2, 16, 8));

        commands.AddLast(new AddStoneWallCommand(2, 0, 9));
        commands.AddLast(new AddStoneWallCommand(2, 14, 9));
        commands.AddLast(new AddStoneWallCommand(2, 15, 9));
        commands.AddLast(new AddStoneWallCommand(2, 16, 9));

        commands.AddLast(new AddStoneWallCommand(2, 0, 10));
        commands.AddLast(new AddStoneWallCommand(2, 15, 10));
        commands.AddLast(new AddStoneWallCommand(2, 16, 10));

        commands.AddLast(new AddStoneWallCommand(2, 0, 11));
        commands.AddLast(new AddStoneWallCommand(2, 16, 11));

        commands.AddLast(new AddStoneWallCommand(2, 0, 12));
        commands.AddLast(new AddStoneWallCommand(2, 1, 12));
        commands.AddLast(new AddStoneWallCommand(2, 16, 12));

        commands.AddLast(new AddStoneWallCommand(2, 0, 13));
        commands.AddLast(new AddStoneWallCommand(2, 1, 13));
        commands.AddLast(new AddStoneWallCommand(2, 2, 13));
        commands.AddLast(new AddStoneWallCommand(2, 15, 13));
        commands.AddLast(new AddStoneWallCommand(2, 16, 13));

        commands.AddLast(new AddStoneWallCommand(2, 0, 14));
        commands.AddLast(new AddStoneWallCommand(2, 1, 14));
        commands.AddLast(new AddStoneWallCommand(2, 2, 14));
        commands.AddLast(new AddStoneWallCommand(2, 3, 14));
        commands.AddLast(new AddStoneWallCommand(2, 4, 14));
        commands.AddLast(new AddStoneWallCommand(2, 5, 14));
        commands.AddLast(new AddStoneWallCommand(2, 6, 14));
        commands.AddLast(new AddStoneWallCommand(2, 11, 14));
        commands.AddLast(new AddStoneWallCommand(2, 12, 14));
        commands.AddLast(new AddStoneWallCommand(2, 13, 14));
        commands.AddLast(new AddStoneWallCommand(2, 14, 14));
        commands.AddLast(new AddStoneWallCommand(2, 15, 14));
        commands.AddLast(new AddStoneWallCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 8));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 8));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 8));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 8));
*/        
    }
    
    public void BuildScreen4()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(4, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 0));
        commands.AddLast(new AddStoneWallCommand(2, 1, 0));
        commands.AddLast(new AddStoneWallCommand(2, 2, 0));
        commands.AddLast(new AddStoneWallCommand(2, 3, 0));
        commands.AddLast(new AddStoneWallCommand(2, 4, 0));
        commands.AddLast(new AddStoneWallCommand(2, 5, 0));
        commands.AddLast(new AddStoneWallCommand(2, 6, 0));
        commands.AddLast(new AddStoneWallCommand(2, 7, 0));
        commands.AddLast(new AddStoneWallCommand(2, 8, 0));
        commands.AddLast(new AddStoneWallCommand(2, 9, 0));
        commands.AddLast(new AddStoneWallCommand(2, 10, 0));
        commands.AddLast(new AddStoneWallCommand(2, 11, 0));
        commands.AddLast(new AddStoneWallCommand(2, 12, 0));
        commands.AddLast(new AddStoneWallCommand(2, 13, 0));
        commands.AddLast(new AddStoneWallCommand(2, 14, 0));
        commands.AddLast(new AddStoneWallCommand(2, 15, 0));
        commands.AddLast(new AddStoneWallCommand(2, 16, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 1));
        commands.AddLast(new AddStoneWallCommand(2, 1, 1));
        commands.AddLast(new AddStoneWallCommand(2, 2, 1));
        commands.AddLast(new AddWaterCommand(2, 3, 1));
        commands.AddLast(new AddWaterCommand(2, 4, 1));
        commands.AddLast(new AddWaterCommand(2, 5, 1));
        commands.AddLast(new AddWaterCommand(2, 6, 1));
        commands.AddLast(new AddWaterCommand(2, 7, 1));
        commands.AddLast(new AddWaterCommand(2, 8, 1));
        commands.AddLast(new AddWaterCommand(2, 9, 1));
        commands.AddLast(new AddWaterCommand(2, 10, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddStoneWallCommand(2, 14, 1));
        commands.AddLast(new AddStoneWallCommand(2, 15, 1));
        commands.AddLast(new AddStoneWallCommand(2, 16, 1));

        commands.AddLast(new AddStoneWallCommand(2, 0, 2));
        commands.AddLast(new AddStoneWallCommand(2, 1, 2));
        commands.AddLast(new AddWaterCommand(2, 2, 2));
        commands.AddLast(new AddWaterCommand(2, 3, 2));
        commands.AddLast(new AddWaterCommand(2, 4, 2));
        commands.AddLast(new AddWaterCommand(2, 5, 2));
        commands.AddLast(new AddWaterCommand(2, 6, 2));
        commands.AddLast(new AddWaterCommand(2, 7, 2));
        commands.AddLast(new AddWaterCommand(2, 8, 2));
        commands.AddLast(new AddWaterCommand(2, 9, 2));
        commands.AddLast(new AddWaterCommand(2, 10, 2));
        commands.AddLast(new AddStoneWallCommand(2, 15, 2));
        commands.AddLast(new AddStoneWallCommand(2, 16, 2));

        commands.AddLast(new AddStoneWallCommand(2, 0, 3));
        commands.AddLast(new AddWaterCommand(2, 1, 3));
        commands.AddLast(new AddWaterCommand(2, 2, 3));
        commands.AddLast(new AddWaterCommand(2, 3, 3));
        commands.AddLast(new AddWaterCommand(2, 4, 3));
        commands.AddLast(new AddWaterCommand(2, 5, 3));
        commands.AddLast(new AddWaterCommand(2, 6, 3));
        commands.AddLast(new AddWaterCommand(2, 7, 3));
        commands.AddLast(new AddWaterCommand(2, 8, 3));
        commands.AddLast(new AddWaterCommand(2, 9, 3));
        commands.AddLast(new AddWaterCommand(2, 10, 3));
        commands.AddLast(new AddWaterCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddStoneWallCommand(2, 16, 3));

        commands.AddLast(new AddStoneWallCommand(2, 0, 4));
        commands.AddLast(new AddWaterCommand(2, 1, 4));
        commands.AddLast(new AddWaterCommand(2, 2, 4));
        commands.AddLast(new AddWaterCommand(2, 3, 4));
        commands.AddLast(new AddWaterCommand(2, 4, 4));
        commands.AddLast(new AddWaterCommand(2, 5, 4));
        commands.AddLast(new AddWaterCommand(2, 6, 4));
        commands.AddLast(new AddWaterCommand(2, 7, 4));
        commands.AddLast(new AddWaterCommand(2, 8, 4));
        commands.AddLast(new AddWaterCommand(2, 9, 4));
        commands.AddLast(new AddWaterCommand(2, 10, 4));
        commands.AddLast(new AddWaterCommand(2, 11, 4));
        commands.AddLast(new AddWaterCommand(2, 12, 4));
        commands.AddLast(new AddRockCommand(2, 13, 4));
        commands.AddLast(new AddStoneWallCommand(2, 16, 4));

        commands.AddLast(new AddWaterCommand(2, 0, 5));
        commands.AddLast(new AddWaterCommand(2, 1, 5));
        commands.AddLast(new AddWaterCommand(2, 2, 5));
        commands.AddLast(new AddWaterCommand(2, 3, 5));
        commands.AddLast(new AddWaterCommand(2, 4, 5));
        commands.AddLast(new AddWaterCommand(2, 5, 5));
        commands.AddLast(new AddWaterCommand(2, 6, 5));
        commands.AddLast(new AddWaterCommand(2, 7, 5));
        commands.AddLast(new AddTreeCommand(2, 9, 5));
        commands.AddLast(new AddWaterCommand(2, 10, 5));
        commands.AddLast(new AddWaterCommand(2, 11, 5));
        commands.AddLast(new AddWaterCommand(2, 12, 5));
        commands.AddLast(new AddWaterCommand(2, 13, 5));
        commands.AddLast(new AddWaterCommand(2, 14, 5));
        commands.AddLast(new AddWaterCommand(2, 15, 5));
        commands.AddLast(new AddStoneWallCommand(2, 16, 5));

        commands.AddLast(new AddWaterCommand(2, 0, 6));
        commands.AddLast(new AddWaterCommand(2, 1, 6));
        commands.AddLast(new AddWaterCommand(2, 2, 6));
        commands.AddLast(new AddWaterCommand(2, 3, 6));
        commands.AddLast(new AddWaterCommand(2, 4, 6));
        commands.AddLast(new AddWaterCommand(2, 5, 6));
        commands.AddLast(new AddRockCommand(2, 6, 6));
        commands.AddLast(new AddWaterCommand(2, 10, 6));
        commands.AddLast(new AddWaterCommand(2, 11, 6));
        commands.AddLast(new AddWaterCommand(2, 12, 6));
        commands.AddLast(new AddWaterCommand(2, 13, 6));
        commands.AddLast(new AddWaterCommand(2, 14, 6));
        commands.AddLast(new AddWaterCommand(2, 15, 6));
        commands.AddLast(new AddStoneWallCommand(2, 16, 6));

        commands.AddLast(new AddWaterCommand(2, 0, 7));
        commands.AddLast(new AddWaterCommand(2, 1, 7));
        commands.AddLast(new AddWaterCommand(2, 2, 7));
        commands.AddLast(new AddWaterCommand(2, 3, 7));
        commands.AddLast(new AddWaterCommand(2, 4, 7));
        commands.AddLast(new AddWaterCommand(2, 5, 7));
        commands.AddLast(new AddWaterCommand(2, 10, 7));
        commands.AddLast(new AddWaterCommand(2, 11, 7));
        commands.AddLast(new AddWaterCommand(2, 12, 7));
        commands.AddLast(new AddWaterCommand(2, 13, 7));
        commands.AddLast(new AddWaterCommand(2, 14, 7));
        commands.AddLast(new AddWaterCommand(2, 15, 7));
        commands.AddLast(new AddStoneWallCommand(2, 16, 7));

        commands.AddLast(new AddWaterCommand(2, 0, 8));
        commands.AddLast(new AddRockCommand(2, 2, 8));
        commands.AddLast(new AddWaterCommand(2, 3, 8));
        commands.AddLast(new AddWaterCommand(2, 4, 8));
        commands.AddLast(new AddWaterCommand(2, 5, 8));
        commands.AddLast(new AddTreeCommand(2, 6, 8));
        commands.AddLast(new AddWaterCommand(2, 9, 8));
        commands.AddLast(new AddWaterCommand(2, 10, 8));
        commands.AddLast(new AddWaterCommand(2, 11, 8));
        commands.AddLast(new AddWaterCommand(2, 12, 8));
        commands.AddLast(new AddWaterCommand(2, 13, 8));
        commands.AddLast(new AddWaterCommand(2, 14, 8));
        commands.AddLast(new AddWaterCommand(2, 15, 8));
        commands.AddLast(new AddStoneWallCommand(2, 16, 8));

        commands.AddLast(new AddStoneWallCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 3, 9));
        commands.AddLast(new AddWaterCommand(2, 4, 9));
        commands.AddLast(new AddWaterCommand(2, 5, 9));
        commands.AddLast(new AddWaterCommand(2, 6, 9));
        commands.AddLast(new AddWaterCommand(2, 7, 9));
        commands.AddLast(new AddWaterCommand(2, 8, 9));
        commands.AddLast(new AddWaterCommand(2, 9, 9));
        commands.AddLast(new AddWaterCommand(2, 10, 9));
        commands.AddLast(new AddWaterCommand(2, 11, 9));
        commands.AddLast(new AddWaterCommand(2, 12, 9));
        commands.AddLast(new AddWaterCommand(2, 13, 9));
        commands.AddLast(new AddWaterCommand(2, 14, 9));
        commands.AddLast(new AddWaterCommand(2, 15, 9));
        commands.AddLast(new AddStoneWallCommand(2, 16, 9));

        commands.AddLast(new AddStoneWallCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddWaterCommand(2, 4, 10));
        commands.AddLast(new AddWaterCommand(2, 5, 10));
        commands.AddLast(new AddWaterCommand(2, 6, 10));
        commands.AddLast(new AddWaterCommand(2, 7, 10));
        commands.AddLast(new AddWaterCommand(2, 8, 10));
        commands.AddLast(new AddWaterCommand(2, 9, 10));
        commands.AddLast(new AddWaterCommand(2, 10, 10));
        commands.AddLast(new AddWaterCommand(2, 11, 10));
        commands.AddLast(new AddWaterCommand(2, 12, 10));
        commands.AddLast(new AddWaterCommand(2, 13, 10));
        commands.AddLast(new AddWaterCommand(2, 14, 10));
        commands.AddLast(new AddWaterCommand(2, 15, 10));
        commands.AddLast(new AddStoneWallCommand(2, 16, 10));

        commands.AddLast(new AddStoneWallCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 4, 11));
        commands.AddLast(new AddWaterCommand(2, 5, 11));
        commands.AddLast(new AddWaterCommand(2, 6, 11));
        commands.AddLast(new AddWaterCommand(2, 7, 11));
        commands.AddLast(new AddWaterCommand(2, 8, 11));
        commands.AddLast(new AddWaterCommand(2, 9, 11));
        commands.AddLast(new AddWaterCommand(2, 10, 11));
        commands.AddLast(new AddWaterCommand(2, 11, 11));
        commands.AddLast(new AddWaterCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddStoneWallCommand(2, 16, 11));

        commands.AddLast(new AddStoneWallCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddStoneWallCommand(2, 16, 12));

        commands.AddLast(new AddStoneWallCommand(2, 0, 13));
        commands.AddLast(new AddStoneWallCommand(2, 1, 13));
        commands.AddLast(new AddRockCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddStoneWallCommand(2, 16, 13));

        commands.AddLast(new AddStoneWallCommand(2, 0, 14));
        commands.AddLast(new AddStoneWallCommand(2, 1, 14));
        commands.AddLast(new AddStoneWallCommand(2, 2, 14));
        commands.AddLast(new AddStoneWallCommand(2, 3, 14));
        commands.AddLast(new AddStoneWallCommand(2, 4, 14));
        commands.AddLast(new AddStoneWallCommand(2, 5, 14));
        commands.AddLast(new AddStoneWallCommand(2, 6, 14));

        commands.AddLast(new AddStoneWallCommand(2, 11, 14));
        commands.AddLast(new AddStoneWallCommand(2, 12, 14));
        commands.AddLast(new AddStoneWallCommand(2, 13, 14));
        commands.AddLast(new AddStoneWallCommand(2, 14, 14));
        commands.AddLast(new AddStoneWallCommand(2, 15, 14));
        commands.AddLast(new AddStoneWallCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 9));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 9));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 9));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 9));
*/        
    }
    
    public void BuildScreen5()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(0, 1));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));

        commands.AddLast(new AddTreeCommand(2, 0, 7));
        commands.AddLast(new AddTreeCommand(2, 0, 8));



        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(4, 15, 5));
        commands.AddLast(new AddTreeCommand(4, 16, 5));

        commands.AddLast(new AddTreeCommand(4, 15, 6));
        commands.AddLast(new AddTreeCommand(4, 16, 6));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));
        commands.AddLast(new AddTreeCommand(2, 7, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));
        commands.AddLast(new AddTreeCommand(2, 7, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));
        commands.AddLast(new AddTreeCommand(2, 7, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 0));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 0));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 0));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 0));

        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 6));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 6));

        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 10));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 10));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 10));
*/        
    }
    
    public void BuildScreen6()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(1, 1));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddStoneWallCommand(2, 0, 0));
        commands.AddLast(new AddStoneWallCommand(2, 1, 0));
        commands.AddLast(new AddStoneWallCommand(2, 2, 0));
        commands.AddLast(new AddStoneWallCommand(2, 3, 0));
        commands.AddLast(new AddStoneWallCommand(2, 4, 0));
        commands.AddLast(new AddStoneWallCommand(2, 5, 0));
        commands.AddLast(new AddStoneWallCommand(2, 6, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 1));
        commands.AddLast(new AddStoneWallCommand(2, 1, 1));
        commands.AddLast(new AddStoneWallCommand(2, 2, 1));
        commands.AddLast(new AddStoneWallCommand(2, 3, 1));
        commands.AddLast(new AddStoneWallCommand(2, 4, 1));
        commands.AddLast(new AddStoneWallCommand(2, 5, 1));
        commands.AddLast(new AddStoneWallCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));


        // Upper-right forest
        commands.AddLast(new AddStoneWallCommand(2, 11, 0));
        commands.AddLast(new AddStoneWallCommand(2, 12, 0));
        commands.AddLast(new AddStoneWallCommand(2, 13, 0));
        commands.AddLast(new AddStoneWallCommand(2, 14, 0));
        commands.AddLast(new AddStoneWallCommand(2, 15, 0));
        commands.AddLast(new AddStoneWallCommand(2, 16, 0));

        commands.AddLast(new AddStoneWallCommand(2, 11, 1));
        commands.AddLast(new AddStoneWallCommand(2, 12, 1));
        commands.AddLast(new AddStoneWallCommand(2, 13, 1));
        commands.AddLast(new AddStoneWallCommand(2, 14, 1));
        commands.AddLast(new AddStoneWallCommand(2, 15, 1));
        commands.AddLast(new AddStoneWallCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(4, 16, 5));
        commands.AddLast(new AddTreeCommand(4, 16, 6));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));
        commands.AddLast(new AddTreeCommand(2, 7, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));
        commands.AddLast(new AddTreeCommand(2, 7, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));
        commands.AddLast(new AddTreeCommand(2, 7, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 11));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 11));


        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 7));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 7));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 7));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 7));

        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 13));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 13));

        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 17));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 17));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 17));
*/        
    }
    
    public void BuildScreen7()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(2, 1));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddStoneWallCommand(2, 0, 0));
        commands.AddLast(new AddStoneWallCommand(2, 1, 0));
        commands.AddLast(new AddStoneWallCommand(2, 2, 0));
        commands.AddLast(new AddStoneWallCommand(2, 3, 0));
        commands.AddLast(new AddStoneWallCommand(2, 4, 0));
        commands.AddLast(new AddStoneWallCommand(2, 5, 0));
        commands.AddLast(new AddStoneWallCommand(2, 6, 0));
        commands.AddLast(new AddStoneWallCommand(2, 7, 0));
        commands.AddLast(new AddStoneWallCommand(2, 8, 0));
        commands.AddLast(new AddStoneWallCommand(2, 9, 0));
        commands.AddLast(new AddStoneWallCommand(2, 10, 0));
        commands.AddLast(new AddStoneWallCommand(2, 11, 0));
        commands.AddLast(new AddStoneWallCommand(2, 12, 0));
        commands.AddLast(new AddStoneWallCommand(2, 13, 0));
        commands.AddLast(new AddStoneWallCommand(2, 14, 0));
        commands.AddLast(new AddStoneWallCommand(2, 15, 0));
        commands.AddLast(new AddStoneWallCommand(2, 16, 0));

        commands.AddLast(new AddStoneWallCommand(2, 0, 1));
        commands.AddLast(new AddStoneWallCommand(2, 1, 1));
        commands.AddLast(new AddStoneWallCommand(2, 2, 1));
        commands.AddLast(new AddStoneWallCommand(2, 3, 1));
        commands.AddLast(new AddStoneWallCommand(2, 4, 1));
        commands.AddLast(new AddStoneWallCommand(2, 5, 1));
        commands.AddLast(new AddStoneWallCommand(2, 6, 1));
        commands.AddLast(new AddStoneWallCommand(2, 7, 1));
        commands.AddLast(new AddStoneWallCommand(2, 8, 1));
        commands.AddLast(new AddStoneWallCommand(2, 9, 1));
        commands.AddLast(new AddStoneWallCommand(2, 10, 1));
        commands.AddLast(new AddStoneWallCommand(2, 11, 1));
        commands.AddLast(new AddStoneWallCommand(2, 12, 1));
        commands.AddLast(new AddStoneWallCommand(2, 13, 1));
        commands.AddLast(new AddStoneWallCommand(2, 14, 1));
        commands.AddLast(new AddStoneWallCommand(2, 15, 1));
        commands.AddLast(new AddStoneWallCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));
        commands.AddLast(new AddTreeCommand(2, 7, 2));
        commands.AddLast(new AddTreeCommand(2, 8, 2));
        commands.AddLast(new AddTreeCommand(2, 9, 2));
        commands.AddLast(new AddTreeCommand(2, 10, 2));
        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));


        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));



        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));




        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));



        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 6));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 6));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 8));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 8));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 8));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 8));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 12));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 12));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 12));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 12));
*/        
    }
    
    public void BuildScreen8()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(3, 1));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));




        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 15, 6));
        commands.AddLast(new AddTreeCommand(2, 16, 6));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 7));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 7));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 7));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 7));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 2, 3));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 2, 3));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 2, 3));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 2, 3));

        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 9));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 9));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 13));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 13));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 13));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 13));
*/        
    }
    
    public void BuildScreen9()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(4, 1));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));





        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 15, 6));
        commands.AddLast(new AddTreeCommand(2, 16, 6));

        commands.AddLast(new AddTreeCommand(2, 15, 7));
        commands.AddLast(new AddTreeCommand(2, 16, 7));

        commands.AddLast(new AddTreeCommand(2, 15, 8));
        commands.AddLast(new AddTreeCommand(2, 16, 8));



        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));



        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 8));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 8));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 4));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 4));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 4));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 4));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 14));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 14));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 14));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 14));
*/        
    }
    
    public void BuildScreen10()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(0, 2));

        commands.AddLast(new AddWaterCommand(2, 0, 0));
        commands.AddLast(new AddWaterCommand(2, 1, 0));
        commands.AddLast(new AddWaterCommand(2, 2, 0));

        commands.AddLast(new AddWaterCommand(2, 0, 1));
        commands.AddLast(new AddWaterCommand(2, 1, 1));
        commands.AddLast(new AddWaterCommand(2, 2, 1));

        commands.AddLast(new AddWaterCommand(2, 0, 2));
        commands.AddLast(new AddWaterCommand(2, 1, 2));
        commands.AddLast(new AddWaterCommand(2, 2, 2));

        commands.AddLast(new AddWaterCommand(2, 0, 3));
        commands.AddLast(new AddWaterCommand(2, 1, 3));
        commands.AddLast(new AddWaterCommand(2, 2, 3));

        commands.AddLast(new AddWaterCommand(2, 0, 4));
        commands.AddLast(new AddWaterCommand(2, 1, 4));
        commands.AddLast(new AddWaterCommand(2, 2, 4));

        commands.AddLast(new AddWaterCommand(2, 0, 5));
        commands.AddLast(new AddWaterCommand(2, 1, 5));
        commands.AddLast(new AddWaterCommand(2, 2, 5));

        commands.AddLast(new AddWaterCommand(2, 0, 6));
        commands.AddLast(new AddWaterCommand(2, 1, 6));
        commands.AddLast(new AddWaterCommand(2, 2, 6));

        commands.AddLast(new AddWaterCommand(2, 0, 7));
        commands.AddLast(new AddWaterCommand(2, 1, 7));
        commands.AddLast(new AddWaterCommand(2, 2, 7));

        commands.AddLast(new AddWaterCommand(2, 0, 8));
        commands.AddLast(new AddWaterCommand(2, 1, 8));
        commands.AddLast(new AddWaterCommand(2, 2, 8));

        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 1, 9));
        commands.AddLast(new AddWaterCommand(2, 2, 9));

        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 1, 10));
        commands.AddLast(new AddWaterCommand(2, 2, 10));

        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 1, 11));
        commands.AddLast(new AddWaterCommand(2, 2, 11));

        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 1, 12));
        commands.AddLast(new AddWaterCommand(2, 2, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));

        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));
        commands.AddLast(new AddTreeCommand(2, 7, 0));

        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));

        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));


        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 5));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 5));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 5));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 5));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 12));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 12));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 12));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 12));



        commands.AddLast(new AddEdgeCommand(4, 3, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 4, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 5, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 6, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 15));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 15));

*/    	
    }
        
    public void BuildScreen11()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(1, 2));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));
        commands.AddLast(new AddTreeCommand(2, 7, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));




        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 16, 6));



        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));





        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 10));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 10));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 10));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 10));

        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 6));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 6));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 6));

        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 12));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 12));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 16));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 16));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 16));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 16));
*/        
    }
    
    public void BuildScreen12()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(2, 2));

        // Upper-left forest. Think Composite!!!
        //            commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddGrassCommand(3, 0, 0));

        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddStairsCommand(2, 4, 4, 26));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));


        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(4, 16, 5));
        commands.AddLast(new AddTreeCommand(4, 16, 6));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 11));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 11));


        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 7));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 7));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 7));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 7));

        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 13));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 13));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 17));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 17));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 17));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 17));
*/        
    }
    
    public void BuildScreen13()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(3, 2));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));


        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 16));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 16));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 11));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 11));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 11));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 11));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 14));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 14));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 14));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 14));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 18));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 18));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 18));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 18));
*/        
    }
    
    public void BuildScreen14()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(4, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 7, 6));
        commands.AddLast(new AddTreeCommand(2, 8, 6));
        commands.AddLast(new AddTreeCommand(2, 9, 6));
        commands.AddLast(new AddTreeCommand(2, 16, 6));

        commands.AddLast(new AddTreeCommand(2, 7, 7));
        commands.AddLast(new AddTreeCommand(2, 9, 7));
        commands.AddLast(new AddTreeCommand(2, 16, 7));

        commands.AddLast(new AddTreeCommand(2, 7, 8));
        commands.AddLast(new AddTreeCommand(2, 8, 8));
        commands.AddLast(new AddTreeCommand(2, 9, 8));
        commands.AddLast(new AddTreeCommand(2, 16, 8));

        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 13));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 13));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 13));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 13));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 9));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 9));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 9));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 9));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 19));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 19));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 19));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 19));    
        	*/
    }
    
    public void BuildScreen15()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(0, 3));

        commands.AddLast(new AddWaterCommand(2, 0, 0));
        commands.AddLast(new AddWaterCommand(2, 1, 0));
        commands.AddLast(new AddWaterCommand(2, 2, 0));

        commands.AddLast(new AddWaterCommand(2, 0, 1));
        commands.AddLast(new AddWaterCommand(2, 1, 1));
        commands.AddLast(new AddWaterCommand(2, 2, 1));

        commands.AddLast(new AddWaterCommand(2, 0, 2));
        commands.AddLast(new AddWaterCommand(2, 1, 2));
        commands.AddLast(new AddWaterCommand(2, 2, 2));

        commands.AddLast(new AddWaterCommand(2, 0, 3));
        commands.AddLast(new AddWaterCommand(2, 1, 3));
        commands.AddLast(new AddWaterCommand(2, 2, 3));

        commands.AddLast(new AddWaterCommand(2, 0, 4));
        commands.AddLast(new AddWaterCommand(2, 1, 4));
        commands.AddLast(new AddWaterCommand(2, 2, 4));
        commands.AddLast(new AddWaterCommand(2, 3, 4));

        commands.AddLast(new AddWaterCommand(2, 0, 5));
        commands.AddLast(new AddWaterCommand(2, 1, 5));
        commands.AddLast(new AddWaterCommand(2, 2, 5));
        commands.AddLast(new AddWaterCommand(2, 3, 5));
        commands.AddLast(new AddWaterCommand(2, 4, 5));

        commands.AddLast(new AddWaterCommand(2, 0, 6));
        commands.AddLast(new AddWaterCommand(2, 1, 6));
        commands.AddLast(new AddWaterCommand(2, 2, 6));
        commands.AddLast(new AddWaterCommand(2, 3, 6));
        commands.AddLast(new AddWaterCommand(2, 4, 6));
        commands.AddLast(new AddWaterCommand(2, 5, 6));

        commands.AddLast(new AddWaterCommand(2, 0, 7));
        commands.AddLast(new AddWaterCommand(2, 1, 7));
        commands.AddLast(new AddWaterCommand(2, 2, 7));
        commands.AddLast(new AddWaterCommand(2, 3, 7));
        commands.AddLast(new AddWaterCommand(2, 4, 7));
        commands.AddLast(new AddWaterCommand(2, 5, 7));
        commands.AddLast(new AddWaterCommand(2, 6, 7));

        commands.AddLast(new AddWaterCommand(2, 0, 8));
        commands.AddLast(new AddWaterCommand(2, 1, 8));
        commands.AddLast(new AddWaterCommand(2, 2, 8));
        commands.AddLast(new AddWaterCommand(2, 3, 8));
        commands.AddLast(new AddWaterCommand(2, 4, 8));
        commands.AddLast(new AddWaterCommand(2, 5, 8));
        commands.AddLast(new AddWaterCommand(2, 6, 8));
        commands.AddLast(new AddWaterCommand(2, 7, 8));

        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 1, 9));
        commands.AddLast(new AddWaterCommand(2, 2, 9));
        commands.AddLast(new AddWaterCommand(2, 3, 9));
        commands.AddLast(new AddWaterCommand(2, 4, 9));
        commands.AddLast(new AddWaterCommand(2, 5, 9));
        commands.AddLast(new AddWaterCommand(2, 6, 9));
        commands.AddLast(new AddWaterCommand(2, 7, 9));

        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 1, 10));
        commands.AddLast(new AddWaterCommand(2, 2, 10));
        commands.AddLast(new AddWaterCommand(2, 3, 10));
        commands.AddLast(new AddWaterCommand(2, 4, 10));
        commands.AddLast(new AddWaterCommand(2, 5, 10));
        commands.AddLast(new AddWaterCommand(2, 6, 10));
        commands.AddLast(new AddWaterCommand(2, 7, 10));

        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 1, 11));
        commands.AddLast(new AddWaterCommand(2, 2, 11));
        commands.AddLast(new AddWaterCommand(2, 3, 11));
        commands.AddLast(new AddWaterCommand(2, 4, 11));
        commands.AddLast(new AddWaterCommand(2, 5, 11));
        commands.AddLast(new AddWaterCommand(2, 6, 11));
        commands.AddLast(new AddWaterCommand(2, 7, 11));

        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 1, 12));
        commands.AddLast(new AddWaterCommand(2, 2, 12));
        commands.AddLast(new AddWaterCommand(2, 3, 12));
        commands.AddLast(new AddWaterCommand(2, 4, 12));
        commands.AddLast(new AddWaterCommand(2, 5, 12));
        commands.AddLast(new AddWaterCommand(2, 6, 12));
        commands.AddLast(new AddWaterCommand(2, 7, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddWaterCommand(2, 3, 13));
        commands.AddLast(new AddWaterCommand(2, 4, 13));
        commands.AddLast(new AddWaterCommand(2, 5, 13));
        commands.AddLast(new AddWaterCommand(2, 6, 13));
        commands.AddLast(new AddWaterCommand(2, 7, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddWaterCommand(2, 3, 14));
        commands.AddLast(new AddWaterCommand(2, 4, 14));
        commands.AddLast(new AddWaterCommand(2, 5, 14));
        commands.AddLast(new AddWaterCommand(2, 6, 14));
        commands.AddLast(new AddWaterCommand(2, 7, 14));





        commands.AddLast(new AddWaterCommand(2, 0, 6));
        commands.AddLast(new AddWaterCommand(2, 1, 6));
        commands.AddLast(new AddWaterCommand(2, 2, 6));

        commands.AddLast(new AddWaterCommand(2, 0, 7));
        commands.AddLast(new AddWaterCommand(2, 1, 7));
        commands.AddLast(new AddWaterCommand(2, 2, 7));

        commands.AddLast(new AddWaterCommand(2, 0, 8));
        commands.AddLast(new AddWaterCommand(2, 1, 8));
        commands.AddLast(new AddWaterCommand(2, 2, 8));

        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 1, 9));
        commands.AddLast(new AddWaterCommand(2, 2, 9));

        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 1, 10));
        commands.AddLast(new AddWaterCommand(2, 2, 10));

        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 1, 11));
        commands.AddLast(new AddWaterCommand(2, 2, 11));

        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 1, 12));
        commands.AddLast(new AddWaterCommand(2, 2, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));




        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 15, 6));
        commands.AddLast(new AddTreeCommand(2, 16, 6));

        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 3, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 4, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 5, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 6, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 10));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 10));


        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 16));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 16));

        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 20));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 20));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 20));

*/    	
    }
    
    public void BuildScreen16()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(1, 3));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 0, 6));
        commands.AddLast(new AddTreeCommand(2, 1, 6));
        commands.AddLast(new AddTreeCommand(2, 2, 6));


        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(4, 15, 5));
        commands.AddLast(new AddTreeCommand(4, 16, 5));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 15));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 15));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 11));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 11));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 11));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 11));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 17));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 17));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 17));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 17));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 21));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 21));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 21));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 21));
*/        
    }
    
    public void BuildScreen17()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(2, 3));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 5));
        commands.AddLast(new AddTreeCommand(2, 1, 5));
        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));



        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));
        commands.AddLast(new AddTreeCommand(2, 5, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));
        commands.AddLast(new AddTreeCommand(2, 5, 11));
        commands.AddLast(new AddTreeCommand(2, 6, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));
        commands.AddLast(new AddTreeCommand(2, 5, 12));
        commands.AddLast(new AddTreeCommand(2, 6, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 16));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 16));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 16));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 12));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 12));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 12));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 12));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 18));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 18));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 18));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 18));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 22));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 22));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 22));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 22));
*/        
    }
    
    public void BuildScreen18()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(3, 3));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));



        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));



        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));
        commands.AddLast(new AddTreeCommand(2, 5, 13));
        commands.AddLast(new AddTreeCommand(2, 6, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));
        commands.AddLast(new AddTreeCommand(2, 5, 14));
        commands.AddLast(new AddTreeCommand(2, 6, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 12, 9));
        commands.AddLast(new AddTreeCommand(2, 13, 9));
        commands.AddLast(new AddTreeCommand(2, 14, 9));
        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 11, 10));
        commands.AddLast(new AddTreeCommand(2, 12, 10));
        commands.AddLast(new AddTreeCommand(2, 13, 10));
        commands.AddLast(new AddTreeCommand(2, 14, 10));
        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 11, 11));
        commands.AddLast(new AddTreeCommand(2, 12, 11));
        commands.AddLast(new AddTreeCommand(2, 13, 11));
        commands.AddLast(new AddTreeCommand(2, 14, 11));
        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 11, 12));
        commands.AddLast(new AddTreeCommand(2, 12, 12));
        commands.AddLast(new AddTreeCommand(2, 13, 12));
        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 11, 13));
        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 11, 14));
        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 17));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 17));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 17));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 17));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 13));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 13));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 13));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 13));

        commands.AddLast(new AddEdgeCommand(4, 16, 4, 1, 19));
        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 19));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 19));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 19));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 19));

        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 23));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 23));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 23));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 23));
*/        
    }
    
    public void BuildScreen19()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(4, 3));

        // Upper-left forest. Think Composite!!!
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));



        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 12, 5));
        commands.AddLast(new AddTreeCommand(2, 13, 5));
        commands.AddLast(new AddTreeCommand(2, 14, 5));
        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));


        // Lower-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 9));
        commands.AddLast(new AddTreeCommand(2, 1, 9));
        commands.AddLast(new AddTreeCommand(2, 2, 9));
        commands.AddLast(new AddTreeCommand(2, 3, 9));
        commands.AddLast(new AddTreeCommand(2, 4, 9));

        commands.AddLast(new AddTreeCommand(2, 0, 10));
        commands.AddLast(new AddTreeCommand(2, 1, 10));
        commands.AddLast(new AddTreeCommand(2, 2, 10));
        commands.AddLast(new AddTreeCommand(2, 3, 10));
        commands.AddLast(new AddTreeCommand(2, 4, 10));

        commands.AddLast(new AddTreeCommand(2, 0, 11));
        commands.AddLast(new AddTreeCommand(2, 1, 11));
        commands.AddLast(new AddTreeCommand(2, 2, 11));
        commands.AddLast(new AddTreeCommand(2, 3, 11));
        commands.AddLast(new AddTreeCommand(2, 4, 11));

        commands.AddLast(new AddTreeCommand(2, 0, 12));
        commands.AddLast(new AddTreeCommand(2, 1, 12));
        commands.AddLast(new AddTreeCommand(2, 2, 12));
        commands.AddLast(new AddTreeCommand(2, 3, 12));
        commands.AddLast(new AddTreeCommand(2, 4, 12));

        commands.AddLast(new AddTreeCommand(2, 0, 13));
        commands.AddLast(new AddTreeCommand(2, 1, 13));
        commands.AddLast(new AddTreeCommand(2, 2, 13));
        commands.AddLast(new AddTreeCommand(2, 3, 13));
        commands.AddLast(new AddTreeCommand(2, 4, 13));

        commands.AddLast(new AddTreeCommand(2, 0, 14));
        commands.AddLast(new AddTreeCommand(2, 1, 14));
        commands.AddLast(new AddTreeCommand(2, 2, 14));
        commands.AddLast(new AddTreeCommand(2, 3, 14));
        commands.AddLast(new AddTreeCommand(2, 4, 14));


        // Lower-right forest
        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 15, 6));
        commands.AddLast(new AddTreeCommand(2, 16, 6));

        commands.AddLast(new AddTreeCommand(2, 15, 7));
        commands.AddLast(new AddTreeCommand(2, 16, 7));

        commands.AddLast(new AddTreeCommand(2, 15, 8));
        commands.AddLast(new AddTreeCommand(2, 16, 8));

        commands.AddLast(new AddTreeCommand(2, 15, 9));
        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 15, 10));
        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 14, 12));
        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 12, 13));
        commands.AddLast(new AddTreeCommand(2, 13, 13));
        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddTreeCommand(2, 12, 14));
        commands.AddLast(new AddTreeCommand(2, 13, 14));
        commands.AddLast(new AddTreeCommand(2, 14, 14));
        commands.AddLast(new AddTreeCommand(2, 15, 14));
        commands.AddLast(new AddTreeCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 18));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 18));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 18));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 18));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 14));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 14));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 14));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 14));

        commands.AddLast(new AddEdgeCommand(4, 5, 14, 2, 24));
        commands.AddLast(new AddEdgeCommand(4, 6, 14, 2, 24));
        commands.AddLast(new AddEdgeCommand(4, 7, 14, 2, 24));
        commands.AddLast(new AddEdgeCommand(4, 8, 14, 2, 24));
        commands.AddLast(new AddEdgeCommand(4, 9, 14, 2, 24));
        commands.AddLast(new AddEdgeCommand(4, 10, 14, 2, 24));
        commands.AddLast(new AddEdgeCommand(4, 11, 14, 2, 24));
*/        
    }
    
    public void BuildScreen20()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(0, 4));

        commands.AddLast(new AddWaterCommand(2, 0, 0));
        commands.AddLast(new AddWaterCommand(2, 1, 0));
        commands.AddLast(new AddWaterCommand(2, 2, 0));
        commands.AddLast(new AddWaterCommand(2, 3, 0));
        commands.AddLast(new AddWaterCommand(2, 4, 0));
        commands.AddLast(new AddWaterCommand(2, 5, 0));
        commands.AddLast(new AddWaterCommand(2, 6, 0));
        commands.AddLast(new AddWaterCommand(2, 7, 0));

        commands.AddLast(new AddWaterCommand(2, 0, 1));
        commands.AddLast(new AddWaterCommand(2, 1, 1));
        commands.AddLast(new AddWaterCommand(2, 2, 1));
        commands.AddLast(new AddWaterCommand(2, 3, 1));
        commands.AddLast(new AddWaterCommand(2, 4, 1));
        commands.AddLast(new AddWaterCommand(2, 5, 1));
        commands.AddLast(new AddWaterCommand(2, 6, 1));
        commands.AddLast(new AddWaterCommand(2, 7, 1));

        commands.AddLast(new AddWaterCommand(2, 0, 2));
        commands.AddLast(new AddWaterCommand(2, 1, 2));
        commands.AddLast(new AddWaterCommand(2, 2, 2));
        commands.AddLast(new AddWaterCommand(2, 3, 2));
        commands.AddLast(new AddWaterCommand(2, 4, 2));
        commands.AddLast(new AddWaterCommand(2, 5, 2));
        commands.AddLast(new AddWaterCommand(2, 6, 2));
        commands.AddLast(new AddWaterCommand(2, 7, 2));

        commands.AddLast(new AddWaterCommand(2, 0, 3));
        commands.AddLast(new AddWaterCommand(2, 1, 3));
        commands.AddLast(new AddWaterCommand(2, 2, 3));
        commands.AddLast(new AddWaterCommand(2, 3, 3));
        commands.AddLast(new AddWaterCommand(2, 4, 3));
        commands.AddLast(new AddWaterCommand(2, 5, 3));
        commands.AddLast(new AddWaterCommand(2, 6, 3));
        commands.AddLast(new AddWaterCommand(2, 7, 3));

        commands.AddLast(new AddWaterCommand(2, 0, 4));
        commands.AddLast(new AddWaterCommand(2, 1, 4));
        commands.AddLast(new AddWaterCommand(2, 2, 4));
        commands.AddLast(new AddWaterCommand(2, 3, 4));
        commands.AddLast(new AddWaterCommand(2, 4, 4));
        commands.AddLast(new AddWaterCommand(2, 5, 4));
        commands.AddLast(new AddWaterCommand(2, 6, 4));
        commands.AddLast(new AddWaterCommand(2, 7, 4));

        commands.AddLast(new AddWaterCommand(2, 0, 5));
        commands.AddLast(new AddWaterCommand(2, 1, 5));
        commands.AddLast(new AddWaterCommand(2, 2, 5));
        commands.AddLast(new AddWaterCommand(2, 3, 5));
        commands.AddLast(new AddWaterCommand(2, 4, 5));
        commands.AddLast(new AddWaterCommand(2, 5, 5));
        commands.AddLast(new AddWaterCommand(2, 6, 5));
        commands.AddLast(new AddWaterCommand(2, 7, 5));

        commands.AddLast(new AddWaterCommand(2, 0, 6));
        commands.AddLast(new AddWaterCommand(2, 1, 6));
        commands.AddLast(new AddWaterCommand(2, 2, 6));
        commands.AddLast(new AddWaterCommand(2, 3, 6));
        commands.AddLast(new AddWaterCommand(2, 4, 6));
        commands.AddLast(new AddWaterCommand(2, 5, 6));
        commands.AddLast(new AddWaterCommand(2, 6, 6));
        commands.AddLast(new AddWaterCommand(2, 7, 6));

        commands.AddLast(new AddWaterCommand(2, 0, 7));
        commands.AddLast(new AddWaterCommand(2, 1, 7));
        commands.AddLast(new AddWaterCommand(2, 2, 7));
        commands.AddLast(new AddWaterCommand(2, 3, 7));
        commands.AddLast(new AddWaterCommand(2, 4, 7));
        commands.AddLast(new AddWaterCommand(2, 5, 7));
        commands.AddLast(new AddWaterCommand(2, 6, 7));
        commands.AddLast(new AddWaterCommand(2, 7, 7));

        commands.AddLast(new AddWaterCommand(2, 0, 8));
        commands.AddLast(new AddWaterCommand(2, 1, 8));
        commands.AddLast(new AddWaterCommand(2, 2, 8));
        commands.AddLast(new AddWaterCommand(2, 3, 8));
        commands.AddLast(new AddWaterCommand(2, 4, 8));
        commands.AddLast(new AddWaterCommand(2, 5, 8));
        commands.AddLast(new AddWaterCommand(2, 6, 8));
        commands.AddLast(new AddWaterCommand(2, 7, 8));




        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));



        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 1, 9));
        commands.AddLast(new AddWaterCommand(2, 2, 9));
        commands.AddLast(new AddWaterCommand(2, 3, 9));
        commands.AddLast(new AddWaterCommand(2, 4, 9));
        commands.AddLast(new AddWaterCommand(2, 5, 9));
        commands.AddLast(new AddWaterCommand(2, 6, 9));
        commands.AddLast(new AddWaterCommand(2, 7, 9));
        commands.AddLast(new AddWaterCommand(2, 8, 9));
        commands.AddLast(new AddWaterCommand(2, 9, 9));
        commands.AddLast(new AddWaterCommand(2, 10, 9));
        commands.AddLast(new AddWaterCommand(2, 11, 9));
        commands.AddLast(new AddWaterCommand(2, 12, 9));
        commands.AddLast(new AddWaterCommand(2, 13, 9));
        commands.AddLast(new AddWaterCommand(2, 14, 9));
        commands.AddLast(new AddWaterCommand(2, 15, 9));
        commands.AddLast(new AddWaterCommand(2, 16, 9));

        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 1, 10));
        commands.AddLast(new AddWaterCommand(2, 2, 10));
        commands.AddLast(new AddWaterCommand(2, 3, 10));
        commands.AddLast(new AddWaterCommand(2, 4, 10));
        commands.AddLast(new AddWaterCommand(2, 5, 10));
        commands.AddLast(new AddWaterCommand(2, 6, 10));
        commands.AddLast(new AddWaterCommand(2, 7, 10));
        commands.AddLast(new AddWaterCommand(2, 8, 10));
        commands.AddLast(new AddWaterCommand(2, 9, 10));
        commands.AddLast(new AddWaterCommand(2, 10, 10));
        commands.AddLast(new AddWaterCommand(2, 11, 10));
        commands.AddLast(new AddWaterCommand(2, 12, 10));
        commands.AddLast(new AddWaterCommand(2, 13, 10));
        commands.AddLast(new AddWaterCommand(2, 14, 10));
        commands.AddLast(new AddWaterCommand(2, 15, 10));
        commands.AddLast(new AddWaterCommand(2, 16, 10));

        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 1, 11));
        commands.AddLast(new AddWaterCommand(2, 2, 11));
        commands.AddLast(new AddWaterCommand(2, 3, 11));
        commands.AddLast(new AddWaterCommand(2, 4, 11));
        commands.AddLast(new AddWaterCommand(2, 5, 11));
        commands.AddLast(new AddWaterCommand(2, 6, 11));
        commands.AddLast(new AddWaterCommand(2, 7, 11));
        commands.AddLast(new AddWaterCommand(2, 8, 11));
        commands.AddLast(new AddWaterCommand(2, 9, 11));
        commands.AddLast(new AddWaterCommand(2, 10, 11));
        commands.AddLast(new AddWaterCommand(2, 11, 11));
        commands.AddLast(new AddWaterCommand(2, 12, 11));
        commands.AddLast(new AddWaterCommand(2, 13, 11));
        commands.AddLast(new AddWaterCommand(2, 14, 11));
        commands.AddLast(new AddWaterCommand(2, 15, 11));
        commands.AddLast(new AddWaterCommand(2, 16, 11));



        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 1, 12));
        commands.AddLast(new AddWaterCommand(2, 2, 12));
        commands.AddLast(new AddWaterCommand(2, 3, 12));
        commands.AddLast(new AddWaterCommand(2, 4, 12));
        commands.AddLast(new AddWaterCommand(2, 5, 12));
        commands.AddLast(new AddWaterCommand(2, 6, 12));
        commands.AddLast(new AddWaterCommand(2, 7, 12));
        commands.AddLast(new AddWaterCommand(2, 8, 12));
        commands.AddLast(new AddWaterCommand(2, 9, 12));
        commands.AddLast(new AddWaterCommand(2, 10, 12));
        commands.AddLast(new AddWaterCommand(2, 11, 12));
        commands.AddLast(new AddWaterCommand(2, 12, 12));
        commands.AddLast(new AddWaterCommand(2, 13, 12));
        commands.AddLast(new AddWaterCommand(2, 14, 12));
        commands.AddLast(new AddWaterCommand(2, 15, 12));
        commands.AddLast(new AddWaterCommand(2, 16, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddWaterCommand(2, 3, 13));
        commands.AddLast(new AddWaterCommand(2, 4, 13));
        commands.AddLast(new AddWaterCommand(2, 5, 13));
        commands.AddLast(new AddWaterCommand(2, 6, 13));
        commands.AddLast(new AddWaterCommand(2, 7, 13));
        commands.AddLast(new AddWaterCommand(2, 8, 13));
        commands.AddLast(new AddWaterCommand(2, 9, 13));
        commands.AddLast(new AddWaterCommand(2, 10, 13));
        commands.AddLast(new AddWaterCommand(2, 11, 13));
        commands.AddLast(new AddWaterCommand(2, 12, 13));
        commands.AddLast(new AddWaterCommand(2, 13, 13));
        commands.AddLast(new AddWaterCommand(2, 14, 13));
        commands.AddLast(new AddWaterCommand(2, 15, 13));
        commands.AddLast(new AddWaterCommand(2, 16, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddWaterCommand(2, 3, 14));
        commands.AddLast(new AddWaterCommand(2, 4, 14));
        commands.AddLast(new AddWaterCommand(2, 5, 14));
        commands.AddLast(new AddWaterCommand(2, 6, 14));
        commands.AddLast(new AddWaterCommand(2, 7, 14));
        commands.AddLast(new AddWaterCommand(2, 8, 14));
        commands.AddLast(new AddWaterCommand(2, 9, 14));
        commands.AddLast(new AddWaterCommand(2, 10, 14));
        commands.AddLast(new AddWaterCommand(2, 11, 14));
        commands.AddLast(new AddWaterCommand(2, 12, 14));
        commands.AddLast(new AddWaterCommand(2, 13, 14));
        commands.AddLast(new AddWaterCommand(2, 14, 14));
        commands.AddLast(new AddWaterCommand(2, 15, 14));
        commands.AddLast(new AddWaterCommand(2, 16, 14));



        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 15));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 15));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 15));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 21));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 21));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 21));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 21));
*/        
    }
    
    public void BuildScreen21()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(1, 4));

        // Upper-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));

        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 2, 6));


        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));




        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 1, 9));
        commands.AddLast(new AddWaterCommand(2, 2, 9));
        commands.AddLast(new AddWaterCommand(2, 3, 9));
        commands.AddLast(new AddWaterCommand(2, 4, 9));
        commands.AddLast(new AddWaterCommand(2, 5, 9));
        commands.AddLast(new AddWaterCommand(2, 6, 9));
        commands.AddLast(new AddWaterCommand(2, 7, 9));
        commands.AddLast(new AddWaterCommand(2, 8, 9));
        commands.AddLast(new AddWaterCommand(2, 9, 9));
        commands.AddLast(new AddWaterCommand(2, 10, 9));
        commands.AddLast(new AddWaterCommand(2, 11, 9));
        commands.AddLast(new AddWaterCommand(2, 12, 9));
        commands.AddLast(new AddWaterCommand(2, 13, 9));
        commands.AddLast(new AddWaterCommand(2, 14, 9));
        commands.AddLast(new AddWaterCommand(2, 15, 9));
        commands.AddLast(new AddWaterCommand(2, 16, 9));

        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 1, 10));
        commands.AddLast(new AddWaterCommand(2, 2, 10));
        commands.AddLast(new AddWaterCommand(2, 3, 10));
        commands.AddLast(new AddWaterCommand(2, 4, 10));
        commands.AddLast(new AddWaterCommand(2, 5, 10));
        commands.AddLast(new AddWaterCommand(2, 6, 10));
        commands.AddLast(new AddWaterCommand(2, 7, 10));
        commands.AddLast(new AddWaterCommand(2, 8, 10));
        commands.AddLast(new AddWaterCommand(2, 9, 10));
        commands.AddLast(new AddWaterCommand(2, 10, 10));
        commands.AddLast(new AddWaterCommand(2, 11, 10));
        commands.AddLast(new AddWaterCommand(2, 12, 10));
        commands.AddLast(new AddWaterCommand(2, 13, 10));
        commands.AddLast(new AddWaterCommand(2, 14, 10));
        commands.AddLast(new AddWaterCommand(2, 15, 10));
        commands.AddLast(new AddWaterCommand(2, 16, 10));

        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 1, 11));
        commands.AddLast(new AddWaterCommand(2, 2, 11));
        commands.AddLast(new AddWaterCommand(2, 3, 11));
        commands.AddLast(new AddWaterCommand(2, 4, 11));
        commands.AddLast(new AddWaterCommand(2, 5, 11));
        commands.AddLast(new AddWaterCommand(2, 6, 11));
        commands.AddLast(new AddWaterCommand(2, 7, 11));
        commands.AddLast(new AddWaterCommand(2, 8, 11));
        commands.AddLast(new AddWaterCommand(2, 9, 11));
        commands.AddLast(new AddWaterCommand(2, 10, 11));
        commands.AddLast(new AddWaterCommand(2, 11, 11));
        commands.AddLast(new AddWaterCommand(2, 12, 11));
        commands.AddLast(new AddWaterCommand(2, 13, 11));
        commands.AddLast(new AddWaterCommand(2, 14, 11));
        commands.AddLast(new AddWaterCommand(2, 15, 11));
        commands.AddLast(new AddWaterCommand(2, 16, 11));



        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 1, 12));
        commands.AddLast(new AddWaterCommand(2, 2, 12));
        commands.AddLast(new AddWaterCommand(2, 3, 12));
        commands.AddLast(new AddWaterCommand(2, 4, 12));
        commands.AddLast(new AddWaterCommand(2, 5, 12));
        commands.AddLast(new AddWaterCommand(2, 6, 12));
        commands.AddLast(new AddWaterCommand(2, 7, 12));
        commands.AddLast(new AddWaterCommand(2, 8, 12));
        commands.AddLast(new AddWaterCommand(2, 9, 12));
        commands.AddLast(new AddWaterCommand(2, 10, 12));
        commands.AddLast(new AddWaterCommand(2, 11, 12));
        commands.AddLast(new AddWaterCommand(2, 12, 12));
        commands.AddLast(new AddWaterCommand(2, 13, 12));
        commands.AddLast(new AddWaterCommand(2, 14, 12));
        commands.AddLast(new AddWaterCommand(2, 15, 12));
        commands.AddLast(new AddWaterCommand(2, 16, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddWaterCommand(2, 3, 13));
        commands.AddLast(new AddWaterCommand(2, 4, 13));
        commands.AddLast(new AddWaterCommand(2, 5, 13));
        commands.AddLast(new AddWaterCommand(2, 6, 13));
        commands.AddLast(new AddWaterCommand(2, 7, 13));
        commands.AddLast(new AddWaterCommand(2, 8, 13));
        commands.AddLast(new AddWaterCommand(2, 9, 13));
        commands.AddLast(new AddWaterCommand(2, 10, 13));
        commands.AddLast(new AddWaterCommand(2, 11, 13));
        commands.AddLast(new AddWaterCommand(2, 12, 13));
        commands.AddLast(new AddWaterCommand(2, 13, 13));
        commands.AddLast(new AddWaterCommand(2, 14, 13));
        commands.AddLast(new AddWaterCommand(2, 15, 13));
        commands.AddLast(new AddWaterCommand(2, 16, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddWaterCommand(2, 3, 14));
        commands.AddLast(new AddWaterCommand(2, 4, 14));
        commands.AddLast(new AddWaterCommand(2, 5, 14));
        commands.AddLast(new AddWaterCommand(2, 6, 14));
        commands.AddLast(new AddWaterCommand(2, 7, 14));
        commands.AddLast(new AddWaterCommand(2, 8, 14));
        commands.AddLast(new AddWaterCommand(2, 9, 14));
        commands.AddLast(new AddWaterCommand(2, 10, 14));
        commands.AddLast(new AddWaterCommand(2, 11, 14));
        commands.AddLast(new AddWaterCommand(2, 12, 14));
        commands.AddLast(new AddWaterCommand(2, 13, 14));
        commands.AddLast(new AddWaterCommand(2, 14, 14));
        commands.AddLast(new AddWaterCommand(2, 15, 14));
        commands.AddLast(new AddWaterCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 20));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 20));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 20));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 20));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 16));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 16));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 16));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 16));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 22));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 22));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 22));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 22));
*/        
    }
    
    public void BuildScreen22()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(2, 4));

        // Upper-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));
        commands.AddLast(new AddTreeCommand(2, 5, 2));
        commands.AddLast(new AddTreeCommand(2, 6, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));
        commands.AddLast(new AddTreeCommand(2, 5, 3));
        commands.AddLast(new AddTreeCommand(2, 6, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));






        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 1, 9));
        commands.AddLast(new AddWaterCommand(2, 2, 9));
        commands.AddLast(new AddWaterCommand(2, 3, 9));

        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 1, 10));
        commands.AddLast(new AddWaterCommand(2, 2, 10));
        commands.AddLast(new AddWaterCommand(2, 3, 10));

        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 1, 11));
        commands.AddLast(new AddWaterCommand(2, 2, 11));
        commands.AddLast(new AddWaterCommand(2, 3, 11));

        commands.AddLast(new AddWaterCommand(2, 13, 9));
        commands.AddLast(new AddWaterCommand(2, 14, 9));
        commands.AddLast(new AddWaterCommand(2, 15, 9));
        commands.AddLast(new AddWaterCommand(2, 16, 9));

        commands.AddLast(new AddWaterCommand(2, 13, 10));
        commands.AddLast(new AddWaterCommand(2, 14, 10));
        commands.AddLast(new AddWaterCommand(2, 15, 10));
        commands.AddLast(new AddWaterCommand(2, 16, 10));

        commands.AddLast(new AddWaterCommand(2, 13, 11));
        commands.AddLast(new AddWaterCommand(2, 14, 11));
        commands.AddLast(new AddWaterCommand(2, 15, 11));
        commands.AddLast(new AddWaterCommand(2, 16, 11));


        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 1, 12));
        commands.AddLast(new AddWaterCommand(2, 2, 12));
        commands.AddLast(new AddWaterCommand(2, 3, 12));
        commands.AddLast(new AddWaterCommand(2, 4, 12));
        commands.AddLast(new AddWaterCommand(2, 5, 12));
        commands.AddLast(new AddWaterCommand(2, 6, 12));
        commands.AddLast(new AddWaterCommand(2, 7, 12));
        commands.AddLast(new AddWaterCommand(2, 8, 12));
        commands.AddLast(new AddWaterCommand(2, 9, 12));
        commands.AddLast(new AddWaterCommand(2, 10, 12));
        commands.AddLast(new AddWaterCommand(2, 11, 12));
        commands.AddLast(new AddWaterCommand(2, 12, 12));
        commands.AddLast(new AddWaterCommand(2, 13, 12));
        commands.AddLast(new AddWaterCommand(2, 14, 12));
        commands.AddLast(new AddWaterCommand(2, 15, 12));
        commands.AddLast(new AddWaterCommand(2, 16, 12));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddWaterCommand(2, 3, 13));
        commands.AddLast(new AddWaterCommand(2, 4, 13));
        commands.AddLast(new AddWaterCommand(2, 5, 13));
        commands.AddLast(new AddWaterCommand(2, 6, 13));
        commands.AddLast(new AddWaterCommand(2, 7, 13));
        commands.AddLast(new AddWaterCommand(2, 8, 13));
        commands.AddLast(new AddWaterCommand(2, 9, 13));
        commands.AddLast(new AddWaterCommand(2, 10, 13));
        commands.AddLast(new AddWaterCommand(2, 11, 13));
        commands.AddLast(new AddWaterCommand(2, 12, 13));
        commands.AddLast(new AddWaterCommand(2, 13, 13));
        commands.AddLast(new AddWaterCommand(2, 14, 13));
        commands.AddLast(new AddWaterCommand(2, 15, 13));
        commands.AddLast(new AddWaterCommand(2, 16, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddWaterCommand(2, 3, 14));
        commands.AddLast(new AddWaterCommand(2, 4, 14));
        commands.AddLast(new AddWaterCommand(2, 5, 14));
        commands.AddLast(new AddWaterCommand(2, 6, 14));
        commands.AddLast(new AddWaterCommand(2, 7, 14));
        commands.AddLast(new AddWaterCommand(2, 8, 14));
        commands.AddLast(new AddWaterCommand(2, 9, 14));
        commands.AddLast(new AddWaterCommand(2, 10, 14));
        commands.AddLast(new AddWaterCommand(2, 11, 14));
        commands.AddLast(new AddWaterCommand(2, 12, 14));
        commands.AddLast(new AddWaterCommand(2, 13, 14));
        commands.AddLast(new AddWaterCommand(2, 14, 14));
        commands.AddLast(new AddWaterCommand(2, 15, 14));
        commands.AddLast(new AddWaterCommand(2, 16, 14));


        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 21));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 21));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 21));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 21));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 17));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 17));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 17));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 17));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 23));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 23));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 23));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 23));
*/    	
    }
    
    public void BuildScreen23()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(3, 4));

        // Upper-left forest
        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));
        commands.AddLast(new AddTreeCommand(2, 5, 0));
        commands.AddLast(new AddTreeCommand(2, 6, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));
        commands.AddLast(new AddTreeCommand(2, 5, 1));
        commands.AddLast(new AddTreeCommand(2, 6, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));


        // Upper-right forest
        commands.AddLast(new AddTreeCommand(2, 11, 0));
        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 11, 1));
        commands.AddLast(new AddTreeCommand(2, 12, 1));
        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 11, 2));
        commands.AddLast(new AddTreeCommand(2, 12, 2));
        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 11, 3));
        commands.AddLast(new AddTreeCommand(2, 12, 3));
        commands.AddLast(new AddTreeCommand(2, 13, 3));
        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 12, 4));
        commands.AddLast(new AddTreeCommand(2, 13, 4));
        commands.AddLast(new AddTreeCommand(2, 14, 4));
        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 12, 5));
        commands.AddLast(new AddTreeCommand(2, 13, 5));
        commands.AddLast(new AddTreeCommand(2, 14, 5));
        commands.AddLast(new AddTreeCommand(2, 15, 5));
        commands.AddLast(new AddTreeCommand(2, 16, 5));


        commands.AddLast(new AddWaterCommand(2, 0, 9));
        commands.AddLast(new AddWaterCommand(2, 0, 10));
        commands.AddLast(new AddWaterCommand(2, 0, 11));
        commands.AddLast(new AddWaterCommand(2, 0, 12));
        commands.AddLast(new AddWaterCommand(2, 0, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));
        commands.AddLast(new AddWaterCommand(2, 3, 13));
        commands.AddLast(new AddWaterCommand(2, 4, 13));
        commands.AddLast(new AddWaterCommand(2, 5, 13));
        commands.AddLast(new AddWaterCommand(2, 6, 13));
        commands.AddLast(new AddWaterCommand(2, 7, 13));
        commands.AddLast(new AddWaterCommand(2, 8, 13));
        commands.AddLast(new AddWaterCommand(2, 9, 13));
        commands.AddLast(new AddWaterCommand(2, 10, 13));
        commands.AddLast(new AddWaterCommand(2, 11, 13));
        commands.AddLast(new AddWaterCommand(2, 12, 13));
        commands.AddLast(new AddWaterCommand(2, 13, 13));
        commands.AddLast(new AddWaterCommand(2, 14, 13));
        commands.AddLast(new AddWaterCommand(2, 15, 13));
        commands.AddLast(new AddWaterCommand(2, 16, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddWaterCommand(2, 3, 14));
        commands.AddLast(new AddWaterCommand(2, 4, 14));
        commands.AddLast(new AddWaterCommand(2, 5, 14));
        commands.AddLast(new AddWaterCommand(2, 6, 14));
        commands.AddLast(new AddWaterCommand(2, 7, 14));
        commands.AddLast(new AddWaterCommand(2, 8, 14));
        commands.AddLast(new AddWaterCommand(2, 9, 14));
        commands.AddLast(new AddWaterCommand(2, 10, 14));
        commands.AddLast(new AddWaterCommand(2, 11, 14));
        commands.AddLast(new AddWaterCommand(2, 12, 14));
        commands.AddLast(new AddWaterCommand(2, 13, 14));
        commands.AddLast(new AddWaterCommand(2, 14, 14));
        commands.AddLast(new AddWaterCommand(2, 15, 14));
        commands.AddLast(new AddWaterCommand(2, 16, 14));



        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 22));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 22));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 22));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 22));

        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 18));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 18));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 18));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 18));

        commands.AddLast(new AddEdgeCommand(4, 16, 5, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 6, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 7, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 8, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 9, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 10, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 11, 1, 24));
        commands.AddLast(new AddEdgeCommand(4, 16, 12, 1, 24));
*/        
    }
    
    public void BuildScreen24()
    {
/*    	
        commands.AddLast(new DeclareScreenCommand(4, 4));

        commands.AddLast(new AddTreeCommand(2, 0, 0));
        commands.AddLast(new AddTreeCommand(2, 1, 0));
        commands.AddLast(new AddTreeCommand(2, 2, 0));
        commands.AddLast(new AddTreeCommand(2, 3, 0));
        commands.AddLast(new AddTreeCommand(2, 4, 0));

        commands.AddLast(new AddTreeCommand(2, 0, 1));
        commands.AddLast(new AddTreeCommand(2, 1, 1));
        commands.AddLast(new AddTreeCommand(2, 2, 1));
        commands.AddLast(new AddTreeCommand(2, 3, 1));
        commands.AddLast(new AddTreeCommand(2, 4, 1));

        commands.AddLast(new AddTreeCommand(2, 0, 2));
        commands.AddLast(new AddTreeCommand(2, 1, 2));
        commands.AddLast(new AddTreeCommand(2, 2, 2));
        commands.AddLast(new AddTreeCommand(2, 3, 2));
        commands.AddLast(new AddTreeCommand(2, 4, 2));

        commands.AddLast(new AddTreeCommand(2, 0, 3));
        commands.AddLast(new AddTreeCommand(2, 1, 3));
        commands.AddLast(new AddTreeCommand(2, 2, 3));
        commands.AddLast(new AddTreeCommand(2, 3, 3));
        commands.AddLast(new AddTreeCommand(2, 4, 3));

        commands.AddLast(new AddTreeCommand(2, 0, 4));
        commands.AddLast(new AddTreeCommand(2, 1, 4));
        commands.AddLast(new AddTreeCommand(2, 2, 4));
        commands.AddLast(new AddTreeCommand(2, 3, 4));
        commands.AddLast(new AddTreeCommand(2, 4, 4));

        commands.AddLast(new AddTreeCommand(2, 2, 5));
        commands.AddLast(new AddTreeCommand(2, 3, 5));

        commands.AddLast(new AddTreeCommand(2, 12, 0));
        commands.AddLast(new AddTreeCommand(2, 13, 0));
        commands.AddLast(new AddTreeCommand(2, 14, 0));
        commands.AddLast(new AddTreeCommand(2, 15, 0));
        commands.AddLast(new AddTreeCommand(2, 16, 0));

        commands.AddLast(new AddTreeCommand(2, 13, 1));
        commands.AddLast(new AddTreeCommand(2, 14, 1));
        commands.AddLast(new AddTreeCommand(2, 15, 1));
        commands.AddLast(new AddTreeCommand(2, 16, 1));

        commands.AddLast(new AddTreeCommand(2, 13, 2));
        commands.AddLast(new AddTreeCommand(2, 14, 2));
        commands.AddLast(new AddTreeCommand(2, 15, 2));
        commands.AddLast(new AddTreeCommand(2, 16, 2));

        commands.AddLast(new AddTreeCommand(2, 14, 3));
        commands.AddLast(new AddTreeCommand(2, 15, 3));
        commands.AddLast(new AddTreeCommand(2, 16, 3));

        commands.AddLast(new AddTreeCommand(2, 15, 4));
        commands.AddLast(new AddTreeCommand(2, 16, 4));

        commands.AddLast(new AddTreeCommand(2, 16, 5));

        commands.AddLast(new AddTreeCommand(2, 16, 6));

        commands.AddLast(new AddTreeCommand(2, 16, 7));

        commands.AddLast(new AddTreeCommand(2, 16, 8));

        commands.AddLast(new AddTreeCommand(2, 16, 9));

        commands.AddLast(new AddTreeCommand(2, 16, 10));

        commands.AddLast(new AddTreeCommand(2, 15, 11));
        commands.AddLast(new AddTreeCommand(2, 16, 11));

        commands.AddLast(new AddTreeCommand(2, 15, 12));
        commands.AddLast(new AddTreeCommand(2, 16, 12));

        commands.AddLast(new AddTreeCommand(2, 14, 13));
        commands.AddLast(new AddTreeCommand(2, 15, 13));
        commands.AddLast(new AddTreeCommand(2, 16, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 13));
        commands.AddLast(new AddWaterCommand(2, 1, 13));
        commands.AddLast(new AddWaterCommand(2, 2, 13));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));

        commands.AddLast(new AddWaterCommand(2, 0, 14));
        commands.AddLast(new AddWaterCommand(2, 1, 14));
        commands.AddLast(new AddWaterCommand(2, 2, 14));
        commands.AddLast(new AddWaterCommand(2, 3, 14));
        commands.AddLast(new AddWaterCommand(2, 4, 14));
        commands.AddLast(new AddWaterCommand(2, 5, 14));
        commands.AddLast(new AddWaterCommand(2, 6, 14));
        commands.AddLast(new AddWaterCommand(2, 7, 14));
        commands.AddLast(new AddWaterCommand(2, 8, 14));
        commands.AddLast(new AddWaterCommand(2, 9, 14));
        commands.AddLast(new AddWaterCommand(2, 10, 14));
        commands.AddLast(new AddWaterCommand(2, 11, 14));
        commands.AddLast(new AddWaterCommand(2, 12, 14));
        commands.AddLast(new AddWaterCommand(2, 13, 14));
        commands.AddLast(new AddWaterCommand(2, 14, 14));
        commands.AddLast(new AddWaterCommand(2, 15, 14));
        commands.AddLast(new AddWaterCommand(2, 16, 14));

        commands.AddLast(new AddEdgeCommand(4, 0, 5, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 6, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 7, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 8, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 9, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 10, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 11, 3, 23));
        commands.AddLast(new AddEdgeCommand(4, 0, 12, 3, 23));

        commands.AddLast(new AddEdgeCommand(4, 5, 0, 0, 19));
        commands.AddLast(new AddEdgeCommand(4, 6, 0, 0, 19));
        commands.AddLast(new AddEdgeCommand(4, 7, 0, 0, 19));
        commands.AddLast(new AddEdgeCommand(4, 8, 0, 0, 19));
        commands.AddLast(new AddEdgeCommand(4, 9, 0, 0, 19));
        commands.AddLast(new AddEdgeCommand(4, 10, 0, 0, 19));
        commands.AddLast(new AddEdgeCommand(4, 11, 0, 0, 19));
*/        
    }
}
