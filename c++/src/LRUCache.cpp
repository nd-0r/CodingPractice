#include <string>
#include <vector>
#include <unordered_map>

using namespace std;

struct CachNode {
    int key;
    int data;
    CachNode* prev = nullptr;
    CachNode* next = nullptr;
};

class LRUCache {
public:
    LRUCache(int capacity) : 
        capacity_(capacity), size_(0) {}
    
    // ~LRUCache() {
    //     CachNode* curr = head_;
    //     while (curr != nullptr) {
    //         CachNode* tmp = curr->next;
    //         delete curr;
    //         curr = tmp;
    //     }
    // }
    
    int get(int key) {
        if (dict_.find(key) == dict_.end()) {
            return -1;
        }
        CachNode* value = dict_[key];
        MoveToHead(value);
        return value->data;
    }
    
    void put(int key, int value) {
        CachNode* to_insert = new CachNode();
        to_insert->key = key;
        to_insert->data = value;
        if (size_ < capacity_) {
            dict_[key] = to_insert;
            InsertAtHead(to_insert);
            ++size_;
        } else if (capacity_ > 0) {
            int lru_key = RemoveLRU();
            dict_.erase(lru_key);
            dict_[key] = to_insert;
            InsertAtHead(to_insert);
        }
    }
private:
    size_t capacity_;
    size_t size_;
    CachNode* head_ = nullptr;
    CachNode* tail_ = nullptr;
    unordered_map<int, CachNode*> dict_;
    
    void MoveToHead(CachNode* node) {
        if (node->prev != nullptr) node->prev->next = node->next;
        if (node->next != nullptr) node->next->prev = node->prev;
        if (node == tail_) tail_ = node->prev;
        InsertAtHead(node);
    }

    void InsertAtHead(CachNode* node) {
        if (head_ == nullptr) {
          tail_ = node;
        } else {
          head_->prev = node;
        }
        node->next = head_;
        node->prev = nullptr;
        head_ = node;
    }

    int RemoveLRU() {
        if (tail_->prev != nullptr) tail_->prev->next = nullptr;
        int tail_key = tail_->key;
        // delete tail_;
        tail_ = tail_->prev;
        return tail_key;
    }
};

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache* obj = new LRUCache(capacity);
 * int param_1 = obj->get(key);
 * obj->put(key,value);
 */

int main() {
  vector<string> commands = {"put", "get", "put", "get", "get"};
  vector<vector<int>> vals = {{2,1},{2},{3,2},{2},{3}};
  LRUCache* lruc = new LRUCache(2);
  for (int i = 0; i < 5; ++i) {
    if (commands[i] == "put") {
      lruc->put(vals[i][0], vals[i][1]);
    } else {
      lruc->get(vals[i][0]);
    }
  }
}