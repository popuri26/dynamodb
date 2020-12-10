package com.repository;

public class DynamoDBRepository<T>{

//	@Autowired
//	private DynamoDBMapper dynamoDBMapper;
//
//	public T create(T t) {
//		dynamoDBMapper.save(t);
//		return t;
//	}
//
//	public T read(Class<T> type, String id) {
//		return dynamoDBMapper.load(type, id);
//	}
//
//	public T update(T t, String id) {
//		Map<String, ExpectedAttributeValue> expectedAttributeValueMap = new HashMap<>();
//		expectedAttributeValueMap.put("id", new ExpectedAttributeValue(new AttributeValue().withS(id)));
//		DynamoDBSaveExpression saveExpression = new DynamoDBSaveExpression().withExpected(expectedAttributeValueMap);
//		dynamoDBMapper.save(t, saveExpression);
//		return t;
//	}
//
//	public void delete(T t, String id) {
//		;
//		Map<String, ExpectedAttributeValue> expectedAttributeValueMap = new HashMap<>();
//		expectedAttributeValueMap.put("id", new ExpectedAttributeValue(new AttributeValue().withS(id)));
//		DynamoDBDeleteExpression deleteExpression = new DynamoDBDeleteExpression()
//				.withExpected(expectedAttributeValueMap);
//		dynamoDBMapper.delete(t, deleteExpression);
//	}
}
