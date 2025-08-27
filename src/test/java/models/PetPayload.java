package models;

import java.util.List;

public class PetPayload {

	     int id;
	     Category category;
	     String name;
	     List<String> photoUrls;
	     List<models.PetPayload.Category.Tag> tags;
	     String status;


	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }

	    public Category getCategory() { return category; }
	    public void setCategory(Category category) { this.category = category; }

	    public String getName() { return name; }
	    public void setName(String name) { this.name = name; }

	    public List<String> getPhotoUrls() { return photoUrls; }
	    public void setPhotoUrls(List<String> photoUrls) { this.photoUrls = photoUrls; }

	    public List<models.PetPayload.Category.Tag> getTags() { return tags; }
	    public void setTags(List<models.PetPayload.Category.Tag> tags) { this.tags = tags; }

	    public String getStatus() { return status; }
	    public void setStatus(String status) { this.status = status; }

//	    @Override
//	    public String toString() {
//	        return "PetPayload{" +
//	                "id=" + id +
//	                ", category=" + category +
//	                ", name='" + name + '\'' +
//	                ", photoUrls=" + photoUrls +
//	                ", tags=" + tags +
//	                ", status='" + status + '\'' +
//	                '}';
//	    }

	    // Nested static classes
	    public static class Category {
	        private int id;
	        private String name;

	        public Category() {}

	        public Category(int id, String name) {
	            this.id = id;
	            this.name = name;
	        }

	        public int getId() { return id; }
	        public void setId(int id) { this.id = id; }

	        public String getName() { return name; }
	        public void setName(String name) { this.name = name; }

//	        @Override
//	        public String toString() {
//	            return "Category{" +
//	                    "id=" + id +
//	                    ", name='" + name + '\'' +
//	                    '}';
//	        }
//	    }

	    public static class Tag {
	        private int id;
	        private String name;

	        public Tag() {}

	        public Tag(int id, String name) {
	            this.id = id;
	            this.name = name;
	        }

	        public int getId() { return id; }
	        public void setId(int id) { this.id = id; }

	        public String getName() { return name; }
	        public void setName(String name) { this.name = name; }

//	        @Override
//	        public String toString() {
//	            return "Tag{" +
//	                    "id=" + id +
//	                    ", name='" + name + '\'' +
//	                    '}';
//	        }
	    }
	    }
}
	    
	

