/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceneedle;

/**
 *
 * @author Bart
 */
public class SpaceNeedle {
    
    public static int kSize = 4;

    public static String BuildReferenceString()
    {
        assert(kSize == 4);
        
        String string = "";
        
        string += "            ||\n";
        string += "            ||\n";
        string += "            ||\n";
        string += "            ||\n";
        string += "         __/||\\__\n";
        string += "      __/:::||:::\\__\n";
        string += "   __/::::::||::::::\\__\n";
        string += "__/:::::::::||:::::::::\\__\n";
        string += "|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n";
        string += "\\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += " \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += "  \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += "   \\_/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += "            ||\n";
        string += "            ||\n";
        string += "            ||\n";
        string += "            ||\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         __/||\\__\n";
        string += "      __/:::||:::\\__\n";
        string += "   __/::::::||::::::\\__\n";
        string += "__/:::::::::||:::::::::\\__\n";
        string += "|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n";
        
        return string;
    }
    
    public static String BuildNeedleString()
    {
        String string = "";
        
        assert(kSize == 4);

        string += "            ||\n";
        string += "            ||\n";
        string += "            ||\n";
        string += "            ||\n";
        
        return string;
    }
    
    public static String BuildPyramidString()
    {
        String string = "";

        assert(kSize == 4);

        string += "         __/||\\__\n";
        string += "      __/:::||:::\\__\n";
        string += "   __/::::::||::::::\\__\n";
        string += "__/:::::::::||:::::::::\\__\n";
        string += "|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|\n";
        
        return string;
    }
    
    public static String BuildSkirtString()
    {
        String string = "";
        
        assert(kSize == 4);

        string += "\\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += " \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += "  \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        string += "   \\_/\\/\\/\\/\\/\\/\\/\\/\\_/\n";
        
        return string;
    }
    
    public static String BuildWaistString()
    {
        String string = "";

        assert(kSize == 4);

        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
        string += "         |%%||%%|\n";
     
        return string;
    }

    public static String BuildSpaceNeedleString()
    {
        String needleString = BuildNeedleString();
        String pyramidString = BuildPyramidString();
        
        String spaceNeedleString = needleString;
        spaceNeedleString += pyramidString;
        spaceNeedleString += BuildSkirtString();
        spaceNeedleString += needleString;
        spaceNeedleString += BuildWaistString();
        spaceNeedleString += pyramidString;
        
        return spaceNeedleString;
    }

    public static void main(String[] args) 
    {
        assert(args.length == 0);   // we don't expect arguments
        
        String spaceNeedleString = BuildSpaceNeedleString();

        String referenceString = BuildReferenceString();
        assert(spaceNeedleString.equals(referenceString));
        
        System.out.print("Size = " + kSize + "\n");
        System.out.print(spaceNeedleString);
    }
    
}
