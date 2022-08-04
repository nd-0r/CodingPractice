use crate::error::DataStructureError;

mod adj_list;
mod adj_matrix;
mod edge_list;

pub type Vertex = i32;
pub struct Edge
{
    from_id: i32,
    to_id: i32,
    weight: i32
}

trait Graph
{
    fn insert_edge(source_id: i32, dest_id: i32, weight: i32) -> Result<(), DataStructureError>;

    fn insert_vertex(id: i32);

    fn remove_vertex(id: i32) -> Result<Vertex, DataStructureError>;

    fn remove_edge(source_id: i32, dest_id: i32) -> Result<Edge, DataStructureError>;

    fn incident_edges(id: i32) -> Result<Vec<Edge>, DataStructureError>;

    fn are_adjacent(v1_id: i32, v2_id: i32) -> Result<bool, DataStructureError>;
}

#[cfg(test)]
mod tests {
    #[test]
    fn it_works() {
        let result = 2 + 2;
        assert_eq!(result, 4);
    }
}
