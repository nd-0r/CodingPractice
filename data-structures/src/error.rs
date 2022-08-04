use std::fmt;

#[derive(Debug)]
pub enum DataStructureError {
    InvalidEdge,
    InvalidVertex,
}

impl std::error::Error for DataStructureError {}

impl fmt::Display for DataStructureError {
    fn fmt(&self, f: &mut fmt::Formatter) -> fmt::Result {
        match self {
            DataStructureError::InvalidEdge => write!(f, "Invalid edge"),
            DataStructureError::InvalidVertex => write!(f, "Invalid vertex"),
        }
    }
}

