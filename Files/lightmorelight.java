  	
//		light more light   	
/*
	 N number of bulbs in a University corridor and a man
named “Mabu” for switching on-off the lights, where every bulb has its own toggles switch.
He walks along the corridor N time and in the i-th walk, he toggles only the switches whose
serial is divisible by i. For example: for the third time of walk he toggles the 3, 6, 9, 12…..
number bulbs switch. Here some important points are:
He doesn’t press any switch when coming back to his initial position.
If once the switch is pressed then the bulb turns on and Another press will turn it off. That
means every odd number of pressed turns on the light, and even number of pressed turns
it off.
 Now the problem is to determinate what is the final condition of the last bulb. Is it on or
off? This problem you can solve using a loop by checking N numbers for N time. But by this
method, it can be exceeded the time limit. To check a long integer may be the time complexity
O(n) is huge time. So to overcome time complexity use a trick. First of all square root the
number then square the number again. If the result is equal to the number then the last light
condition is turned on otherwise off. 
*/

import java.io.*;
import java.lang.*;

class lightmorelight
	{
		public static void main(String args[])
			{
				StringBuffer B;
				String S;
				int N,Length,i;
				char c;
				while(true)
					{
						try
						{
							B=new StringBuffer();
							while((c=(char)System.in.read())!='\n'&&c!=-1)
							B.append(c);
						}
						catch(IOException e)
						{
							break;
						}
						S=B.toString();
						N = Integer.parseInt(S.substring(0,S.length()-1));
						if(N==0||c==-1)
						break;
						if(Math.pow(Math.floor(Math.sqrt(N)),2)==N)
							System.out.println("yes");
						else
							System.out.println("no");
					}
			}
	};