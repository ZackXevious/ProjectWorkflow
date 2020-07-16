package system;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileSystem {
	
	public FileSystem(){
		
	}
	public void saveProject(String fileName)
    {/*The saveUsers Method: Implements various classes to save the current
        UserList as a file, for easier access in the future.*/
        try
        {
            FileOutputStream fileOut=
                new FileOutputStream(new File(fileName+".wkf"));
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this);
            out.close();
            fileOut.close();
        }catch(IOException i){
            System.out.println("Could Not Write file");
            i.printStackTrace();
        }
    }
	public Object loadProject(String FileName)
    {/*The loadUsers Method: Implements various classes to load the current
        UserList as a file, for easier access and less hardcoding*/
                try
        (FileInputStream fileIn = new FileInputStream(FileName); 
                ObjectInputStream in = new ObjectInputStream(fileIn)) {
            return (Object)in.readObject();
        }
        catch(IOException i)
        {
            System.out.println("Could Not Load File "+FileName);
        }
        catch(ClassNotFoundException c)
        {
            System.out.println("Incorrect File Type!");
        }
        return null;
    }

}
