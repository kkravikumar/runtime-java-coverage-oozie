/**
 * 
 */
package com.ravik.oozie.runtime.coverage.mr;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

/**
 * @author Ravi K
 *
 */
public class SampleMapper extends Mapper<LongWritable, Text, LongWritable, Text>
{
	@Override
	protected void map(LongWritable key, Text value, Mapper<LongWritable, Text, LongWritable, Text>.Context context)
			throws IOException, InterruptedException {
		System.out.println("Yes, console log only. This is just to show mapper is called.");
		context.write(key, value);
	}
}