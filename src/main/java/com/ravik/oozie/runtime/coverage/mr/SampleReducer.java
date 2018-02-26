/**
 * 
 */
package com.ravik.oozie.runtime.coverage.mr;

import java.io.IOException;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

/**
 * @author Ravi K
 *
 */
public class SampleReducer extends Reducer<LongWritable, Text, LongWritable, Text> {

	@Override
	protected void reduce(LongWritable arg0, Iterable<Text> arg1, Reducer<LongWritable, Text, LongWritable, Text>.Context context)
			throws IOException, InterruptedException {
		System.out.println("Yes, console log only. This is just to show Reducer is called.");
		context.write(arg0, arg1.iterator().next());
	}
}
