use crate::graph::Graph;

use super::Vertex;

struct AdjList
{
    vertices: Vec<Vertex>,
    adj_list: Vec<Box<i32>>,
}


