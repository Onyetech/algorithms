package com.ikennascode;

public class MrMyers {

    public static int minimal(int input1,int[] arr)

    {

        int sum=0;

        for(int i=0;i<input1;i++)

        {

            for(int j=i+1;j<input1;j++)

            {

                if(arr[i]==arr[j])

                {

                    int[] count = new int[]{1};

                    arr[i]=arr[i]+count[0];

                } 

            }

        }

        for(int i=0;i<input1;i++)

        {

            sum=sum+arr[i];

        }

        return sum;

    }

//    input1: 5
//
//    input2: {1,3,3,5,7}
//
//    Output
//
//20
}
