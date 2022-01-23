// Given a vector of intervals represented as a tuple of inclusive integer endpoints s and e 
// where s <= e, merge overlapping intervals and return a vector of the merged intervals.
use std::vec;

fn merge_intervals(intervals: &Vec<Vec<i32>>) -> Vec<Vec<i32>> {
    let mut out = intervals.clone();
    out.sort_by(|a, b| a[0].cmp(&b[0]));

    let mut size = out.len() - 1;
    let mut curr_idx = 0;
    while curr_idx < size {
        if out[curr_idx + 1][0] <= out[curr_idx][1] {
            out[curr_idx][1] = std::cmp::max(out[curr_idx][1], out[curr_idx + 1][1]);
            out.remove(curr_idx + 1);
            size -= 1;
        } else {
            curr_idx += 1;
        }
    }

    out
}

fn main() {
  let test1: Vec<Vec<i32>> = vec![vec![1, 2], vec![2, 3], vec![5, 6], vec![3, 4], vec![6, 7], vec![9, 10]];
  // expect: [[1, 4], [5, 7], [9, 10]]
  let test2: Vec<Vec<i32>> = vec![vec![1, 2], vec![3, 4], vec![5, 6]];
  // expect: [[1, 2], [3, 4], [5, 6]]
  let test3: Vec<Vec<i32>> = vec![vec![1, 4], vec![2, 5], vec![6, 7]];
  // expect: [[1, 5], [6, 7]]
  let test4: Vec<Vec<i32>> = vec![vec![2, 4], vec![1, 3], vec![0, 2], vec![6, 7]];
  // expect: [[0, 4], [6, 7]]
  let test5: Vec<Vec<i32>> = vec![vec![1, 1], vec![2, 2]];
  // expect: [[1, 1], [2, 2]]

  for test in vec![test1, test2, test3, test4, test5].iter_mut() {
      let result = merge_intervals(test);
      println!("{:?}", result);
      println!("");
  }
}
