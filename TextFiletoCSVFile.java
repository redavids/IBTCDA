package defaultpackage;

import java.io.*;

public class TextFiletoCSVFile {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		String[] fileName = {"C:\\Users\\Chris\\workspace\\DVM\\2.1_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\2.15_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\3.1_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\3.15_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\3.29_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\4.12_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\4.26_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\5.10_2.txt",
							 "C:\\Users\\Chris\\workspace\\DVM\\5.24_2.txt"};
		PrintWriter pw01 = new PrintWriter(new File("2_01.csv"));
		PrintWriter pw02 = new PrintWriter(new File("2_15.csv"));
		PrintWriter pw03 = new PrintWriter(new File("3_01.csv"));
		PrintWriter pw04 = new PrintWriter(new File("3_15.csv"));
		PrintWriter pw05 = new PrintWriter(new File("3_29.csv"));
		PrintWriter pw06 = new PrintWriter(new File("4_12.csv"));
		PrintWriter pw07 = new PrintWriter(new File("4_26.csv"));
		PrintWriter pw08 = new PrintWriter(new File("5_10.csv"));
		PrintWriter pw09 = new PrintWriter(new File("5_24.csv"));
		
		
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[0])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw01.write(sb.toString());
			pw01.close();
			System.out.println("Done 1 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[1])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw02.write(sb.toString());
			pw02.close();
			System.out.println("Done 2 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[2])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw03.write(sb.toString());
			pw03.close();
			System.out.println("Done 3 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[3])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw04.write(sb.toString());
			pw04.close();
			System.out.println("Done 4 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[4])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw05.write(sb.toString());
			pw05.close();
			System.out.println("Done 5 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[5])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw06.write(sb.toString());
			pw06.close();
			System.out.println("Done 6 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[6])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw07.write(sb.toString());
			pw07.close();
			System.out.println("Done 7 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[7])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw08.write(sb.toString());
			pw08.close();
			System.out.println("Done 8 of 9!");
		}
		
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName[8])))
		{		
			String line = null, xstring = null, ystring = null;
			int count = -3;
			StringBuilder sb = new StringBuilder();
			sb.append("Point");sb.append(',');
			sb.append("Birth");sb.append(',');
			sb.append("Death");sb.append('\n');
			
			while((line = bufferedReader.readLine()) != null)
			{
				if(count < 0)
				{
					count++;
				}
				else
				{
					//System.out.println(line);
					//System.out.print(line.substring(0,14) + " " + line.substring(17,29));
					xstring = line.substring(0,14);
					ystring = line.substring(16,29);
					//System.out.print("Point: "+ count+ "  " + xstring+" "+ ystring);
					//System.out.println();
					
					sb.append(count);sb.append(',');
					sb.append(xstring);sb.append(',');
					sb.append(ystring);sb.append('\n');
					count++;
				}
				
			}
			
			pw09.write(sb.toString());
			pw09.close();
			System.out.println("Done 9 of 9!");
		}
		
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	
	
}
